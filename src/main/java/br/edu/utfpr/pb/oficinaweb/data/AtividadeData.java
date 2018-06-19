package br.edu.utfpr.pb.oficinaweb.data;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.utfpr.pb.oficinaweb.model.Atividade;


public interface AtividadeData extends JpaRepository<Atividade, Long> {

}
