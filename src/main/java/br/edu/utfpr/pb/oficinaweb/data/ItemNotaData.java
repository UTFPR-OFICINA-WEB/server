package br.edu.utfpr.pb.oficinaweb.data;

import br.edu.utfpr.pb.oficinaweb.model.ItemNota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemNotaData extends JpaRepository<ItemNota, Long> {
}
