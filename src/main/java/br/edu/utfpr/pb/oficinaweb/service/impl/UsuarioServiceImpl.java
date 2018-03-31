package br.edu.utfpr.pb.oficinaweb.service.impl;

import br.edu.utfpr.pb.oficinaweb.data.UsuarioData;
import br.edu.utfpr.pb.oficinaweb.model.Usuario;
import br.edu.utfpr.pb.oficinaweb.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl extends CrudServiceImpl<Usuario, Long> implements UsuarioService, UserDetailsService, CommandLineRunner {

    @Autowired private UsuarioData usuarioData;

    @Override
    protected JpaRepository<Usuario, Long> getData() {
        return usuarioData;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return usuarioData.findByUsername(s).orElseThrow(() -> new UsernameNotFoundException("username not found"));
    }

    @Override
    public void run(String... args) throws Exception {
        Usuario usuario = Usuario.builder()
                .id(1L)
                .username("admin")
                .password(new BCryptPasswordEncoder().encode("admin"))
                .nome("Administrador")
                .email("joao.p.merlin@gmail.com")
                .ativo(true)
                .build();

        usuarioData.save(usuario);
    }

}
