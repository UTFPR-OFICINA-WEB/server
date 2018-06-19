package br.edu.utfpr.pb.oficinaweb.data;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.utfpr.pb.oficinaweb.model.Cargo;

public interface CargoData extends JpaRepository<Cargo, Long>{

}
