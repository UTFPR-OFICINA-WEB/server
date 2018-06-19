package br.edu.utfpr.pb.oficinaweb.data;

import br.edu.utfpr.pb.oficinaweb.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaData extends JpaRepository<Pessoa, Long> {
}
