package br.edu.utfpr.pb.oficinaweb.data;

import br.edu.utfpr.pb.oficinaweb.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteData extends JpaRepository<Cliente, Long> {
}
