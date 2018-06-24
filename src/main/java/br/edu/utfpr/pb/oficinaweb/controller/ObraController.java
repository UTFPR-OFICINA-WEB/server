package br.edu.utfpr.pb.oficinaweb.controller;

import br.edu.utfpr.pb.oficinaweb.model.Cliente;
import br.edu.utfpr.pb.oficinaweb.model.Obra;
import br.edu.utfpr.pb.oficinaweb.service.CrudService;
import br.edu.utfpr.pb.oficinaweb.service.ObraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("obra")
public class ObraController extends CrudController<Obra, Long> {

    @Autowired
    private ObraService obraService;

    @Override
    protected CrudService<Obra, Long> getService() {
        return obraService;
    }
}
