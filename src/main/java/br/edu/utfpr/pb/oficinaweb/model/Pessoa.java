package br.edu.utfpr.pb.oficinaweb.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy=InheritanceType.JOINED)
public  class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable=false)
    private String nome;

    private String apelido;

    @Column(nullable=false)
    private String cgc;

    @Column(nullable=false)
    private String telefone;

    @Column(nullable=false)
    private String endereco;

    private String email;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idcidade", referencedColumnName = "id", nullable=false)
    private Cidade cidade;

    @Column(nullable=false)
    private boolean ativo;
}
