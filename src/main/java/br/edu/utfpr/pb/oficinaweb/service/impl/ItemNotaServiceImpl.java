package br.edu.utfpr.pb.oficinaweb.service.impl;

import br.edu.utfpr.pb.oficinaweb.data.ItemNotaData;
import br.edu.utfpr.pb.oficinaweb.model.ItemNota;
import br.edu.utfpr.pb.oficinaweb.service.ItemNotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemNotaServiceImpl extends CrudServiceImpl<ItemNota, Long> implements ItemNotaService {

    @Autowired
    private ItemNotaData itemNotaData;

    @Override
    protected JpaRepository<ItemNota, Long> getData() {
        return itemNotaData;

    }
}
