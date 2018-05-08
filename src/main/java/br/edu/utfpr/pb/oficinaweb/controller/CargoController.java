package br.edu.utfpr.pb.oficinaweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.utfpr.pb.oficinaweb.model.Cargo;
import br.edu.utfpr.pb.oficinaweb.service.CargoService;
import br.edu.utfpr.pb.oficinaweb.service.CrudService;

@RestController
@RequestMapping("cargo")
public class CargoController extends CrudController<Cargo, Long> {
	
	@Autowired private CargoService cargoService;

	@Override
	protected CrudService<Cargo, Long> getService() {
		return cargoService;
	}
	
	

}
