package br.edu.utfpr.pb.oficinaweb.data;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.utfpr.pb.oficinaweb.model.Atributo;
import br.edu.utfpr.pb.oficinaweb.model.AtributoFunc;

public interface AtributoFuncData extends JpaRepository<AtributoFunc, Long>{

}
