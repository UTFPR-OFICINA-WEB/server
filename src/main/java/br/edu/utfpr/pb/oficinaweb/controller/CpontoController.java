package br.edu.utfpr.pb.oficinaweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.utfpr.pb.oficinaweb.model.Cponto;
import br.edu.utfpr.pb.oficinaweb.service.CpontoService;
import br.edu.utfpr.pb.oficinaweb.service.CrudService;

@RestController
@RequestMapping("cponto")
public class CpontoController extends CrudController<Cponto, Long> {
	
	@Autowired private CpontoService cpontoService;
	
	@Override
	protected CrudService<Cponto, Long> getService() {
		return cpontoService;
	}

}
