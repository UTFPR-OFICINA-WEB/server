package br.edu.utfpr.pb.oficinaweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.utfpr.pb.oficinaweb.model.AtributoFunc;
import br.edu.utfpr.pb.oficinaweb.service.AtributoFuncService;
import br.edu.utfpr.pb.oficinaweb.service.CrudService;

@RestController
@RequestMapping("atributofunc")
public class AtributoFuncController extends CrudController<AtributoFunc, Long> {
	
	@Autowired
	private AtributoFuncService atributoFuncService;

	@Override
	protected CrudService<AtributoFunc, Long> getService() {
		return atributoFuncService;
	}
	
	

}
