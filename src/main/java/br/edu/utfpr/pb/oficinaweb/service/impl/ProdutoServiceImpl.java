package br.edu.utfpr.pb.oficinaweb.service.impl;

import br.edu.utfpr.pb.oficinaweb.data.ProdutoData;
import br.edu.utfpr.pb.oficinaweb.model.Produto;
import br.edu.utfpr.pb.oficinaweb.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImpl extends CrudServiceImpl<Produto, Long> implements ProdutoService {

    @Autowired private ProdutoData produtoData;

    @Override
    protected JpaRepository<Produto, Long> getData() {
        return produtoData;
    }
}
