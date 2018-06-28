package br.edu.utfpr.pb.oficinaweb.data;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.utfpr.pb.oficinaweb.model.Fornecedor;

public interface FornecedorData extends JpaRepository<Fornecedor, Long> {
}
