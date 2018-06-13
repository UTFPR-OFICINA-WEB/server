package br.edu.utfpr.pb.oficinaweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.utfpr.pb.oficinaweb.model.Usuario;
import br.edu.utfpr.pb.oficinaweb.service.CrudService;
import br.edu.utfpr.pb.oficinaweb.service.UsuarioService;

@RestController
@RequestMapping("usuario")
public class UsuarioController extends CrudController<Usuario, Long> {

    @Autowired private UsuarioService usuarioService;

    @Override
    protected CrudService<Usuario, Long> getService() {
        return usuarioService;
    }
    
    @PostMapping
    public Usuario save(@RequestBody Usuario entity) {
    	List<Usuario> usuarios = usuarioService.findAll();
    	for (Usuario usuario : usuarios) {
			if (entity.getUsername().equals(usuario.getUsername())) {
				throw new RuntimeException("Erro. Esse login ja existe!");
				
			}
		}
        entity.setPassword(entity.getEncodedPassword(entity.getPassword()));
    	return getService().save(entity);
    }
}
