package br.edu.utfpr.pb.oficinaweb.data;

import br.edu.utfpr.pb.oficinaweb.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeData extends JpaRepository<Cidade, Long> {
}
