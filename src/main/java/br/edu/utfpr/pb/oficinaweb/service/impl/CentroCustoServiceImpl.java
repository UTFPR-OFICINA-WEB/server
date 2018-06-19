package br.edu.utfpr.pb.oficinaweb.service.impl;

import br.edu.utfpr.pb.oficinaweb.data.CentroCustoData;
import br.edu.utfpr.pb.oficinaweb.model.CentroCusto;
import br.edu.utfpr.pb.oficinaweb.service.CentroCustoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CentroCustoServiceImpl extends CrudServiceImpl<CentroCusto, Long> implements CentroCustoService {

    @Autowired
    private CentroCustoData centroCustoData;

    @Override
    protected JpaRepository<CentroCusto, Long> getData() {
        return centroCustoData;
    }
}
