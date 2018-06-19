package br.edu.utfpr.pb.oficinaweb.service.impl;

import br.edu.utfpr.pb.oficinaweb.data.ProdutoServicoData;
import br.edu.utfpr.pb.oficinaweb.model.ProdutoServico;


import br.edu.utfpr.pb.oficinaweb.service.ProdutoServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServicoServiceImpl extends CrudServiceImpl<ProdutoServico, Long> implements ProdutoServicoService {

    @Autowired
    private ProdutoServicoData produtoServicoData;

    @Override
    protected JpaRepository<ProdutoServico, Long> getData() {
        return produtoServicoData;
    }

}
