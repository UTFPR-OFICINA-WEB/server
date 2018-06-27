package br.edu.utfpr.pb.oficinaweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.utfpr.pb.oficinaweb.model.Cidade;
import br.edu.utfpr.pb.oficinaweb.service.CidadeService;
import br.edu.utfpr.pb.oficinaweb.service.CrudService;
import br.edu.utfpr.pb.oficinaweb.service.EstadoService;

@RestController
@RequestMapping("cidade")
public class CidadeController extends CrudController<Cidade, Long> {

    @Autowired private CidadeService cidadeService;
    @Autowired private EstadoService estadoService;

    @Override
    protected CrudService<Cidade, Long> getService() {
        return cidadeService;
    }
    @GetMapping("/findByEstado")
    public List<Cidade> findByEstado(Long id){
    	return cidadeService.findByEstado(estadoService.findOne(id));
    }
}