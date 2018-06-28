package br.edu.utfpr.pb.oficinaweb.data;

import br.edu.utfpr.pb.oficinaweb.model.Devolucao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DevolucaoData extends JpaRepository<Devolucao, Long> {
}
