package br.edu.utfpr.pb.oficinaweb.service.impl;

import br.edu.utfpr.pb.oficinaweb.data.PessoaData;
import br.edu.utfpr.pb.oficinaweb.model.Pessoa;
import br.edu.utfpr.pb.oficinaweb.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
public class PessoaServiceImpl extends CrudServiceImpl<Pessoa, Long> implements PessoaService {

    @Autowired
    private PessoaData pessoaData;

    @Override
    protected JpaRepository<Pessoa, Long> getData() {
        return pessoaData;
    }
}
