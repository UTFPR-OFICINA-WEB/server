package br.edu.utfpr.pb.oficinaweb.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.PrimaryKeyJoinColumn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@PrimaryKeyJoinColumn(referencedColumnName="id")
public class Funcionario extends Pessoa implements Serializable{

	@Column(nullable=false)
    private String matricula;
    
	@Column(nullable=false)
    private String admissao;
    
	@Column(nullable=false)
    private Double salario;
    
	@Column(nullable=false)
    private Setor setor;
    
	@Column(nullable=false)
    private Cargo cargo;
}
