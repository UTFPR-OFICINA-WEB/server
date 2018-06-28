package br.edu.utfpr.pb.oficinaweb.service.impl;

import br.edu.utfpr.pb.oficinaweb.data.DevolucaoData;
import br.edu.utfpr.pb.oficinaweb.model.Devolucao;
import br.edu.utfpr.pb.oficinaweb.service.DevolucaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class DevolucaoServiceImpl extends CrudServiceImpl<Devolucao, Long> implements DevolucaoService {


	@Autowired private DevolucaoData devolucaoData;
	

	@Override
	protected JpaRepository<Devolucao, Long> getData() {
		return devolucaoData;
	}
}
