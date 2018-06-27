package br.edu.utfpr.pb.oficinaweb.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String nome;
  
    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private String tipo;

    @Min(0)
    @Max(100000)
    @Column(nullable = false)
    private Long estoque;

    @Min(0)
    @Max(100000)
    @Column(nullable = false)
    private Double valor;

}
