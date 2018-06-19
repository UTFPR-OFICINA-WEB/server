package br.edu.utfpr.pb.oficinaweb.controller;


import br.edu.utfpr.pb.oficinaweb.model.ProdutoServico;
import br.edu.utfpr.pb.oficinaweb.service.CrudService;
import br.edu.utfpr.pb.oficinaweb.service.ProdutoServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtoServico")
public class ProdutoServicoController extends CrudController<ProdutoServico, Long> {

    @Autowired
    private ProdutoServicoService produtoServicoService;

    @Override
    protected CrudService<ProdutoServico, Long> getService() {
        return produtoServicoService;
    }
}
