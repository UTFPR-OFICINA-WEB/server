package br.edu.utfpr.pb.oficinaweb.controller;


import br.edu.utfpr.pb.oficinaweb.model.Fornecedor;
import br.edu.utfpr.pb.oficinaweb.service.CrudService;
import br.edu.utfpr.pb.oficinaweb.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fornecedor")
public class FornecedorController extends CrudController<Fornecedor, Long>{

    @Autowired
    private FornecedorService fornecedorService;

    @Override
    protected CrudService<Fornecedor, Long> getService() {
        return fornecedorService;
    }
}
