package br.edu.utfpr.pb.oficinaweb.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AtributoFunc implements Serializable {
	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
		
		@ManyToOne
	    private Funcionario funcionario;
	    
		@ManyToOne
	    private Atributo atributo;
		
//		private String teste;
	    
	    @Temporal(TemporalType.DATE)
	    private Date dataVenc;

}