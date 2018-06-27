package br.edu.utfpr.pb.oficinaweb.controller;

import br.edu.utfpr.pb.oficinaweb.model.ConsumoObra;
import br.edu.utfpr.pb.oficinaweb.service.ConsumoObraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.utfpr.pb.oficinaweb.service.CrudService;

@RestController
@RequestMapping("consumoObra")
public class CpontoController extends CrudController<ConsumoObra, Long> {
	
	@Autowired private ConsumoObraService consumoObraService;
	
	@Override
	protected CrudService<ConsumoObra, Long> getService() {
		return consumoObraService;
	}

}
