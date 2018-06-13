package br.edu.utfpr.pb.oficinaweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.utfpr.pb.oficinaweb.model.Funcionario;
import br.edu.utfpr.pb.oficinaweb.service.CrudService;
import br.edu.utfpr.pb.oficinaweb.service.FuncionarioService;

@RestController
@RequestMapping("funcionario")
public class FuncionarioController extends CrudController<Funcionario, Long> {
	
	@Autowired private FuncionarioService funcionarioService;
	
	@Override
	protected CrudService<Funcionario, Long> getService() {
		return funcionarioService;
	}

}
