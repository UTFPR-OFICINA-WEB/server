package br.edu.utfpr.pb.oficinaweb.data;

import br.edu.utfpr.pb.oficinaweb.model.Local;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalData extends JpaRepository<Local, Long> {
}
