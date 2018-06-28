package br.edu.utfpr.pb.oficinaweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.edu.utfpr.pb.oficinaweb.data.CidadeData;
import br.edu.utfpr.pb.oficinaweb.model.Cidade;
import br.edu.utfpr.pb.oficinaweb.model.Estado;
import br.edu.utfpr.pb.oficinaweb.service.CidadeService;

@Service
public class CidadeServiceImpl extends CrudServiceImpl<Cidade, Long> implements CidadeService {

    @Autowired private CidadeData cidadeData;

    @Override
    protected JpaRepository<Cidade, Long> getData() {
        return cidadeData;
    }

	@Override
	public List<Cidade> findByEstado(Estado estado) {
		return cidadeData.findByEstado(estado);
	}
}