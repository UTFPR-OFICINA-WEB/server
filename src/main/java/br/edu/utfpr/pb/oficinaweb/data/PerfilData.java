package br.edu.utfpr.pb.oficinaweb.data;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.utfpr.pb.oficinaweb.model.Perfil;

public interface PerfilData extends JpaRepository<Perfil, Long>{

}
