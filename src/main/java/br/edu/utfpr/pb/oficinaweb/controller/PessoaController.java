package br.edu.utfpr.pb.oficinaweb.controller;

import br.edu.utfpr.pb.oficinaweb.model.Cliente;
import br.edu.utfpr.pb.oficinaweb.model.Pessoa;
import br.edu.utfpr.pb.oficinaweb.service.CrudService;
import br.edu.utfpr.pb.oficinaweb.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pessoa")
public class PessoaController extends CrudController<Pessoa, Long> {

    @Autowired
    private PessoaService pessoaService;

    @Override
    protected CrudService<Pessoa, Long> getService() {
        return pessoaService;
    }
}
