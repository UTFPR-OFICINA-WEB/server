package br.edu.utfpr.pb.oficinaweb.data;

import br.edu.utfpr.pb.oficinaweb.model.Obra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ObraData extends JpaRepository<Obra, Long> {
}
