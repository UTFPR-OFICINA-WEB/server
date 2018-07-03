package br.edu.utfpr.pb.oficinaweb.model;


import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Nota implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String dataEmissao;

    @Column(nullable = false)
    private String dataEntrada;


    @OneToMany(mappedBy ="nota", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private List<ItemNota> itensNota;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_pessoa", referencedColumnName = "id")
    private Cliente cliente;

    //@ManyToOne(fetch = FetchType.EAGER)
    //@ManyToOne(optional = false)
    //@JoinColumn(name = "id_pessoa", referencedColumnName = "id")
    //private Cliente cliente;

}
