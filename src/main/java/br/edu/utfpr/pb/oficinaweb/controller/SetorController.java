package br.edu.utfpr.pb.oficinaweb.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.utfpr.pb.oficinaweb.model.Setor;
import br.edu.utfpr.pb.oficinaweb.service.CrudService;
import br.edu.utfpr.pb.oficinaweb.service.SetorService;

@RestController
@RequestMapping("setor")
public class SetorController extends CrudController<Setor, Long> {
	
	 @Autowired private SetorService setorService;
	 @Valid
    @Override
    protected CrudService<Setor, Long> getService() {
        return setorService;
    }

}
