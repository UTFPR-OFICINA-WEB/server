package br.edu.utfpr.pb.oficinaweb.controller;

import br.edu.utfpr.pb.oficinaweb.model.Usuario;
import br.edu.utfpr.pb.oficinaweb.service.CrudService;
import br.edu.utfpr.pb.oficinaweb.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuario")
public class UsuarioController extends CrudController<Usuario, Long> {

    @Autowired private UsuarioService usuarioService;

    @Override
    protected CrudService<Usuario, Long> getService() {
        return usuarioService;
    }
}
