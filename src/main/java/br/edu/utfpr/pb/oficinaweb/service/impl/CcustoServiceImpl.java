package br.edu.utfpr.pb.oficinaweb.service.impl;

import br.edu.utfpr.pb.oficinaweb.data.CcustoData;
import br.edu.utfpr.pb.oficinaweb.model.Ccusto;
import br.edu.utfpr.pb.oficinaweb.service.CcustoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CcustoServiceImpl extends CrudServiceImpl<Ccusto, Long> implements CcustoService {

    @Autowired private CcustoData ccustoData;

    @Override
    protected JpaRepository<Ccusto, Long> getData() {
        return ccustoData;
    }
}
