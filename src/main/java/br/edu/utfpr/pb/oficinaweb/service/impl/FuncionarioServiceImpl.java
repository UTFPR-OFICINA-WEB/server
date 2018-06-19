package br.edu.utfpr.pb.oficinaweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.edu.utfpr.pb.oficinaweb.data.FuncionarioData;
import br.edu.utfpr.pb.oficinaweb.model.Funcionario;
import br.edu.utfpr.pb.oficinaweb.service.FuncionarioService;

@Service
public class FuncionarioServiceImpl extends CrudServiceImpl<Funcionario, Long> implements FuncionarioService{
	
	@Autowired private FuncionarioData funcionarioData;
	
	@Override
	protected JpaRepository<Funcionario, Long> getData() {
		return funcionarioData;
	}

}
