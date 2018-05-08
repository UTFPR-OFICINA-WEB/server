package br.edu.utfpr.pb.oficinaweb.data;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.utfpr.pb.oficinaweb.model.Funcionario;

public interface FuncionarioData extends JpaRepository<Funcionario, Long> {

}
