package br.edu.utfpr.pb.oficinaweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.utfpr.pb.oficinaweb.model.Cliente;
import br.edu.utfpr.pb.oficinaweb.service.CrudService;
import br.edu.utfpr.pb.oficinaweb.service.ClienteService;

@RestController
@RequestMapping("cliente")
public class ClienteController extends CrudController<Cliente, Long> {

    @Autowired private ClienteService clienteService;

    @Override
    protected CrudService<Cliente, Long> getService() {
        return clienteService;
    }



}
