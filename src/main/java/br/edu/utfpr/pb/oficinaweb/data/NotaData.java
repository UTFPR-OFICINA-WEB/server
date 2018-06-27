package br.edu.utfpr.pb.oficinaweb.data;


import br.edu.utfpr.pb.oficinaweb.model.Nota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaData extends JpaRepository<Nota, Long> {
}
