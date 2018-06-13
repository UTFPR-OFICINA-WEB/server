package br.edu.utfpr.pb.oficinaweb.controller;


import br.edu.utfpr.pb.oficinaweb.model.ItemNota;
import br.edu.utfpr.pb.oficinaweb.service.CrudService;
import br.edu.utfpr.pb.oficinaweb.service.ItemNotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("itemNota")
public class ItemNotaController extends CrudController<ItemNota, Long>{


    @Autowired private ItemNotaService itemNotaService;

    @Override
    protected CrudService<ItemNota, Long> getService() {

        return itemNotaService;
    }
}
