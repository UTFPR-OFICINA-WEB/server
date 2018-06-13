package br.edu.utfpr.pb.oficinaweb.controller;

import br.edu.utfpr.pb.oficinaweb.model.Ccusto;
import br.edu.utfpr.pb.oficinaweb.service.CcustoService;
import br.edu.utfpr.pb.oficinaweb.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ccusto")
public class CcustoController extends CrudController<Ccusto, Long> {

    @Autowired private CcustoService ccustoService;

    @Override
    protected CrudService<Ccusto, Long> getService() {
        return ccustoService;
    }
}
