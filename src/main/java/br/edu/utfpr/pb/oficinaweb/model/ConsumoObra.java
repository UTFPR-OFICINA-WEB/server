package br.edu.utfpr.pb.oficinaweb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsumoObra implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private Obra obra;

    @Min(0)
    @Max(100000)
    @Column(nullable = false)
    private Long qtd;

    @ManyToOne(optional = false)
    private Produto produto;


}
