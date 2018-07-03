package br.edu.utfpr.pb.oficinaweb.service.impl;

import br.edu.utfpr.pb.oficinaweb.data.ConsumoObraData;
import br.edu.utfpr.pb.oficinaweb.model.ConsumoObra;
import br.edu.utfpr.pb.oficinaweb.service.ConsumoObraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ConsumoObraServiceImpl extends CrudServiceImpl<ConsumoObra, Long> implements ConsumoObraService {


	@Autowired private ConsumoObraData consumoObraData;


	@Override
	protected JpaRepository<ConsumoObra, Long> getData() {
		return consumoObraData;
	}
}
