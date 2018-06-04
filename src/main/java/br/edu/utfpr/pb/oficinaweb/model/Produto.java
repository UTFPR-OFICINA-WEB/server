package br.edu.utfpr.pb.oficinaweb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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
    
    @Column(unique = true)
    private String descricao;
    
    @Column(length = 1, nullable = false)
    private String tipo;
    
    @Column(nullable = false)
    private Long estoque;
    
    @Column(nullable = false)
    private float valor;

}
