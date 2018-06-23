package br.edu.utfpr.pb.oficinaweb.model;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
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
    
    private Obra obra;
	
	@JoinColumn(name = "idAtributo", referencedColumnName = "id")
	@ManyToMany
	private List <Atributo> atributo;
		
    @JoinColumn(name = "idFuncionario", referencedColumnName = "id")
	@ManyToMany
	private List <Funcionario> funcionario;
	
	private String descricao;
    
	@Temporal(TemporalType.DATE)
    private Date inicio;
	
	private LocalTime horaInicial;
    
	@Temporal(TemporalType.DATE)
    private Date fim;
	
	private LocalTime horaFinal;
   
	@Temporal(TemporalType.DATE)
    private Date inicioPrevisto;
	
	private LocalTime horaInicialPrevisto;
    
    @Temporal(TemporalType.DATE)
    private Date fimPrevisto;
    
    private LocalTime horaFinalPrevisto;

}
