package br.edu.utfpr.pb.oficinaweb.data;

import br.edu.utfpr.pb.oficinaweb.model.ConsumoObra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsumoObraData extends JpaRepository<ConsumoObra, Long> {
}
