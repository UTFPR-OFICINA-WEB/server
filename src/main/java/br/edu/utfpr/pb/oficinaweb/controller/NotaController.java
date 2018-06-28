package br.edu.utfpr.pb.oficinaweb.controller;


import br.edu.utfpr.pb.oficinaweb.model.Nota;
import br.edu.utfpr.pb.oficinaweb.service.CrudService;
import br.edu.utfpr.pb.oficinaweb.service.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
@RequestMapping("nota")

public class NotaController extends CrudController<Nota, Long>{

    @Autowired private NotaService notaService;
    @Valid
    @Override
    protected CrudService<Nota, Long> getService() {
        return notaService;
    }
}
