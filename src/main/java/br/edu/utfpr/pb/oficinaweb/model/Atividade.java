package br.edu.utfpr.pb.oficinaweb.model;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

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
    
	@ManyToOne(optional = false)
    private Obra obra;
	
	@JoinColumn(name = "idAtributo", referencedColumnName = "id")
	@ManyToMany
	@Column(nullable = false)
	@NotNull
	private List <Atributo> atributo;
		
    @JoinColumn(name = "idFuncionario", referencedColumnName = "id")
	@ManyToMany
	@Column(nullable = false)
    @NotNull
	private List <Funcionario> funcionario;
	
    @Column(nullable = false)
	private String descricao;
    
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
    private Date inicio;
	
	@Column(nullable = false)
	private LocalTime horaInicial;
    
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
    private Date fim;
	
	@Column(nullable = false)
	private LocalTime horaFinal;
   
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
    private Date inicioPrevisto;
	
	@Column(nullable = false)
	private LocalTime horaInicialPrevisto;
    
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fimPrevisto;
    
    @Column(nullable = false)
    private LocalTime horaFinalPrevisto;

}
