package br.edu.utfpr.pb.oficinaweb.data;

import br.edu.utfpr.pb.oficinaweb.model.ProdutoServico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoServicoData extends JpaRepository<ProdutoServico, Long> {
}
