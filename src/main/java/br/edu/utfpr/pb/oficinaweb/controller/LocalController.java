package br.edu.utfpr.pb.oficinaweb.controller;

import br.edu.utfpr.pb.oficinaweb.model.Local;
import br.edu.utfpr.pb.oficinaweb.model.Obra;
import br.edu.utfpr.pb.oficinaweb.service.CrudService;
import br.edu.utfpr.pb.oficinaweb.service.LocalService;
import br.edu.utfpr.pb.oficinaweb.service.ObraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("local")
public class LocalController extends CrudController<Local, Long>{

    @Autowired
    private LocalService localService;

    @Override
    protected CrudService<Local, Long> getService() {
        return localService;
    }
}


