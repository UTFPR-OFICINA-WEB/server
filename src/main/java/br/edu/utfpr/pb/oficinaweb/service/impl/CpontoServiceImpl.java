package br.edu.utfpr.pb.oficinaweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.edu.utfpr.pb.oficinaweb.data.CpontoData;
import br.edu.utfpr.pb.oficinaweb.model.Cponto;
import br.edu.utfpr.pb.oficinaweb.service.CpontoService;

@Service
public class CpontoServiceImpl extends CrudServiceImpl<Cponto, Long> implements CpontoService {

    @Autowired
    private CpontoData cpontoData;

    @Override
    protected JpaRepository<Cponto, Long> getData() {
        return cpontoData;
    }

}
