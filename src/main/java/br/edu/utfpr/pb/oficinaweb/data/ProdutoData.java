package br.edu.utfpr.pb.oficinaweb.data;

import br.edu.utfpr.pb.oficinaweb.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoData extends JpaRepository<Produto, Long> {
}
