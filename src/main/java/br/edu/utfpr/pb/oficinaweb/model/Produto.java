package br.edu.utfpr.pb.oficinaweb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javafx.scene.control.RadioButton;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    
    @Column(length = 1, nullable = false)
    private String tipo;
    
    @Column(nullable = false)
    private Long estoque;
    
    @Column(nullable = false)
    private Number valor;

}
