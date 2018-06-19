package br.edu.utfpr.pb.oficinaweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.edu.utfpr.pb.oficinaweb.data.EstadoData;
import br.edu.utfpr.pb.oficinaweb.model.Estado;
import br.edu.utfpr.pb.oficinaweb.service.EstadoService;

@Service
public class EstadoServiceImpl extends CrudServiceImpl<Estado, Long> implements EstadoService {

    @Autowired private EstadoData estadoData;

    @Override
    protected JpaRepository<Estado, Long> getData() {
        return estadoData;
    }
}
