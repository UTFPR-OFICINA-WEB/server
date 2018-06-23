package br.edu.utfpr.pb.oficinaweb.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.utfpr.pb.oficinaweb.model.Cidade;
import br.edu.utfpr.pb.oficinaweb.model.Estado;

public interface CidadeData extends JpaRepository<Cidade, Long> {
	List<Cidade> findByEstado(Estado estado);
}
