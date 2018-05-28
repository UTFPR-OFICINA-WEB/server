package br.edu.utfpr.pb.oficinaweb.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Atividade implements Serializable{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
//    private Obra obra;
	
	
//    @JoinColumn(name = "idFuncionario", referencedColumnName = "id")
	@ManyToOne
	private Funcionario funcionario;
	
	private String descricao;
    
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
    private Date inicio;
    
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
    private Date fim;
    
//    @Column(nullable = false)
//    private Date inicioPrevisto;
//    
//    @Column(nullable = false)
//    private Date fimPrevisto;

}
