package br.edu.utfpr.pb.oficinaweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.edu.utfpr.pb.oficinaweb.data.AtributoFuncData;
import br.edu.utfpr.pb.oficinaweb.model.AtributoFunc;
import br.edu.utfpr.pb.oficinaweb.service.AtributoFuncService;

@Service
public class AtributoFuncServiceImpl extends CrudServiceImpl<AtributoFunc, Long> implements AtributoFuncService{
	
	@Autowired
	private AtributoFuncData atributoFuncData;
	
	@Override
	protected JpaRepository<AtributoFunc, Long> getData() {
		return atributoFuncData;
	}

}
