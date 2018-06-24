package br.edu.utfpr.pb.oficinaweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.utfpr.pb.oficinaweb.model.Estado;
import br.edu.utfpr.pb.oficinaweb.service.CrudService;
import br.edu.utfpr.pb.oficinaweb.service.EstadoService;

@RestController
@RequestMapping("estado")
public class EstadoController extends CrudController<Estado, Long> {

    @Autowired private EstadoService estadoService;

    @Override
    protected CrudService<Estado, Long> getService() {
        return estadoService;
    }
}
