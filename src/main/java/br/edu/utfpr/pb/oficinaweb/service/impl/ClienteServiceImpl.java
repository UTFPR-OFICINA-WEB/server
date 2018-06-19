package br.edu.utfpr.pb.oficinaweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.edu.utfpr.pb.oficinaweb.data.ClienteData;
import br.edu.utfpr.pb.oficinaweb.model.Cliente;
import br.edu.utfpr.pb.oficinaweb.service.ClienteService;

@Service
public class ClienteServiceImpl extends CrudServiceImpl<Cliente, Long> implements ClienteService {

    @Autowired private ClienteData clienteData;

    @Override
    protected JpaRepository<Cliente, Long> getData() {
        return clienteData;
    }
}
