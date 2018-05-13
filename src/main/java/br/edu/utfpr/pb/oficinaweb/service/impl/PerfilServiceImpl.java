package br.edu.utfpr.pb.oficinaweb.service.impl;

import br.edu.utfpr.pb.oficinaweb.data.PerfilData;
import br.edu.utfpr.pb.oficinaweb.model.Perfil;
import br.edu.utfpr.pb.oficinaweb.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class PerfilServiceImpl extends CrudServiceImpl<Perfil, Long> implements PerfilService{

    @Autowired private PerfilData perfilData;

    @Override
    protected JpaRepository<Perfil, Long> getData() {
        return perfilData;
    }
}
