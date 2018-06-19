package br.edu.utfpr.pb.oficinaweb.controller;

import br.edu.utfpr.pb.oficinaweb.model.CentroCusto;
import br.edu.utfpr.pb.oficinaweb.service.CentroCustoService;
import br.edu.utfpr.pb.oficinaweb.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("centroCusto")
public class CentroCustoController extends CrudController<CentroCusto, Long>{

    @Autowired
    private CentroCustoService centroCustoService;

    @Override
    protected CrudService<CentroCusto, Long> getService() {
        return centroCustoService;
    }
}
