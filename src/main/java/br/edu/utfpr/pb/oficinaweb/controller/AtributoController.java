package br.edu.utfpr.pb.oficinaweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.utfpr.pb.oficinaweb.model.Atributo;
import br.edu.utfpr.pb.oficinaweb.service.AtributoService;
import br.edu.utfpr.pb.oficinaweb.service.CrudService;

@RestController
@RequestMapping("atributo")
public class AtributoController extends CrudController<Atributo, Long> {
	
	@Autowired
	private AtributoService atributoService;

	@Override
	protected CrudService<Atributo, Long> getService() {
		return atributoService;
	}
	
	

}
