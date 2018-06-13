package br.edu.utfpr.pb.oficinaweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.utfpr.pb.oficinaweb.model.Atividade;
import br.edu.utfpr.pb.oficinaweb.service.AtividadeService;
import br.edu.utfpr.pb.oficinaweb.service.CrudService;

@RestController
@RequestMapping("atividade")
public class AtividadeController extends CrudController<Atividade, Long> {
	
	@Autowired private AtividadeService atividadeService;
	
	@Override
	protected CrudService<Atividade, Long> getService() {
		return atividadeService;
	}

}
