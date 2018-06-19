package br.edu.utfpr.pb.oficinaweb.data;

import br.edu.utfpr.pb.oficinaweb.model.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorData extends JpaRepository<Fornecedor, Long> {
}
