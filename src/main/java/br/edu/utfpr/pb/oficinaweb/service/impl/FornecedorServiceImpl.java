package br.edu.utfpr.pb.oficinaweb.service.impl;

import br.edu.utfpr.pb.oficinaweb.data.FornecedorData;
import br.edu.utfpr.pb.oficinaweb.model.Fornecedor;
import br.edu.utfpr.pb.oficinaweb.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class FornecedorServiceImpl extends CrudServiceImpl<Fornecedor, Long> implements FornecedorService {

    @Autowired
    private FornecedorData fornecedorData;

    @Override
    protected JpaRepository<Fornecedor, Long> getData() {
        return fornecedorData;
    }
}
