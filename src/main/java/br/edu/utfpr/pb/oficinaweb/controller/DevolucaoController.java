package br.edu.utfpr.pb.oficinaweb.controller;


import br.edu.utfpr.pb.oficinaweb.model.Devolucao;
import br.edu.utfpr.pb.oficinaweb.service.CrudService;
import br.edu.utfpr.pb.oficinaweb.service.DevolucaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("devolucao")
public class DevolucaoController extends CrudController<Devolucao, Long> {
	
	@Autowired private DevolucaoService devolucaoService;
	
	@Override
	protected CrudService<Devolucao, Long> getService() {
		return devolucaoService;
	}

}
