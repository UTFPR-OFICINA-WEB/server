package br.edu.utfpr.pb.oficinaweb.service.impl;

import br.edu.utfpr.pb.oficinaweb.data.CidadeData;
import br.edu.utfpr.pb.oficinaweb.data.ProdutoData;
import br.edu.utfpr.pb.oficinaweb.model.Cidade;
import br.edu.utfpr.pb.oficinaweb.model.Produto;
import br.edu.utfpr.pb.oficinaweb.service.CidadeService;
import br.edu.utfpr.pb.oficinaweb.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CidadeServiceImpl extends CrudServiceImpl<Cidade, Long> implements CidadeService {
    @Autowired
    private CidadeData cidadeData;

    @Override
    protected JpaRepository<Cidade, Long> getData() {
        return cidadeData;
    }
}
