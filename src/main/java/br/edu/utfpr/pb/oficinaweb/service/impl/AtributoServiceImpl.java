package br.edu.utfpr.pb.oficinaweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.edu.utfpr.pb.oficinaweb.data.AtributoData;
import br.edu.utfpr.pb.oficinaweb.model.Atributo;
import br.edu.utfpr.pb.oficinaweb.service.AtributoService;

@Service
public class AtributoServiceImpl extends CrudServiceImpl<Atributo, Long> implements AtributoService{
	
	@Autowired private AtributoData atributoData;
	
	@Override
	protected JpaRepository<Atributo, Long> getData() {
		return atributoData;
	}

}
