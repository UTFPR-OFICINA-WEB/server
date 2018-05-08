package br.edu.utfpr.pb.oficinaweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.edu.utfpr.pb.oficinaweb.data.SetorData;
import br.edu.utfpr.pb.oficinaweb.model.Setor;
import br.edu.utfpr.pb.oficinaweb.service.SetorService;

@Service
public class SetorServiceImpl extends CrudServiceImpl<Setor, Long> implements SetorService {
	
	@Autowired private SetorData setorData;
	
	@Override
	protected JpaRepository<Setor, Long> getData() {
		return setorData;
	}

}
