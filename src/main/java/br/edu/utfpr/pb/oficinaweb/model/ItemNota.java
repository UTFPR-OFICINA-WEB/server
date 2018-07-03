package br.edu.utfpr.pb.oficinaweb.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(of = "id")
public class ItemNota implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private double quantidade;

    @Column(nullable = false)
    private double valorUnitario;

    @ManyToOne
    @JoinColumn(name = "idProduto", referencedColumnName = "id")
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "idNota", referencedColumnName = "id")
    @JsonIgnore
    private Nota nota;
}
