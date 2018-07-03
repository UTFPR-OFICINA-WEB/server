package br.edu.utfpr.pb.oficinaweb.service.impl;


import br.edu.utfpr.pb.oficinaweb.data.ObraData;
import br.edu.utfpr.pb.oficinaweb.model.Obra;
import br.edu.utfpr.pb.oficinaweb.service.ObraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.edu.utfpr.pb.oficinaweb.data.ObraData;
import br.edu.utfpr.pb.oficinaweb.model.Obra;
import br.edu.utfpr.pb.oficinaweb.service.ObraService;

@Service
public class ObraServiceImpl extends CrudServiceImpl<Obra, Long> implements ObraService {


    @Autowired
    private ObraData obraData;

    @Override
    protected JpaRepository<Obra, Long> getData() {
        return obraData;
    }
}
