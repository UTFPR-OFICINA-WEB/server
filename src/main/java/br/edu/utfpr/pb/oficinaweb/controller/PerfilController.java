package br.edu.utfpr.pb.oficinaweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.utfpr.pb.oficinaweb.model.Perfil;
import br.edu.utfpr.pb.oficinaweb.service.CrudService;
import br.edu.utfpr.pb.oficinaweb.service.PerfilService;

@RestController
@RequestMapping("perfil")
public class PerfilController extends CrudController<Perfil, Long> {

	@Autowired
	private PerfilService perfilService;

	@Override
	protected CrudService<Perfil, Long> getService() {
		return perfilService;
	}

}
