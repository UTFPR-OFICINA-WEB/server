package br.edu.utfpr.pb.oficinaweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.edu.utfpr.pb.oficinaweb.data.AtividadeData;
import br.edu.utfpr.pb.oficinaweb.model.Atividade;
import br.edu.utfpr.pb.oficinaweb.service.AtividadeService;

@Service
public class AtividadeServiceImpl extends CrudServiceImpl<Atividade, Long> implements AtividadeService{
	
	@Autowired private AtividadeData atividadeData;
	
	@Override
	protected JpaRepository<Atividade, Long> getData() {
		return atividadeData;
	}

}
