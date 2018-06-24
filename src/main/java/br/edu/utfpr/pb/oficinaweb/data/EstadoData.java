package br.edu.utfpr.pb.oficinaweb.data;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.utfpr.pb.oficinaweb.model.Estado;

public interface EstadoData extends JpaRepository<Estado, Long> {
}
