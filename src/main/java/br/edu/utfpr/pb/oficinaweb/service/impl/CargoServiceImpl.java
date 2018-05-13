package br.edu.utfpr.pb.oficinaweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.edu.utfpr.pb.oficinaweb.data.CargoData;
import br.edu.utfpr.pb.oficinaweb.model.Cargo;
import br.edu.utfpr.pb.oficinaweb.service.CargoService;

@Service
public class CargoServiceImpl extends CrudServiceImpl<Cargo, Long> implements CargoService{
	
	@Autowired private CargoData cargoData;
	
	@Override
	protected JpaRepository<Cargo, Long> getData() {
		return cargoData;
	}

}
