package br.edu.utfpr.pb.oficinaweb.service;

import java.util.List;

import br.edu.utfpr.pb.oficinaweb.model.Cidade;
import br.edu.utfpr.pb.oficinaweb.model.Estado;

public interface CidadeService extends CrudService<Cidade, Long> {
	List<Cidade> findByEstado(Estado estado);
}