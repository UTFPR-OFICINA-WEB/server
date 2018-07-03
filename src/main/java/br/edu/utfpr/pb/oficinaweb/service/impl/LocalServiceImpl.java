package br.edu.utfpr.pb.oficinaweb.service.impl;

import br.edu.utfpr.pb.oficinaweb.data.LocalData;
import br.edu.utfpr.pb.oficinaweb.model.Local;
import br.edu.utfpr.pb.oficinaweb.service.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalServiceImpl extends CrudServiceImpl<Local, Long> implements LocalService {

    @Autowired
    private LocalData localData;

    @Override
    protected JpaRepository<Local, Long> getData() {
        return localData;
    }
}
