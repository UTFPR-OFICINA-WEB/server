package br.edu.utfpr.pb.oficinaweb.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
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
    private double quantidade;
    private double valorUnitario;
    private double valorTotal;

    @ManyToOne
    @JoinColumn(name = "idProduto", referencedColumnName = "id")
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "idNota", referencedColumnName = "id")
    @JsonIgnore
     private Nota nota;

}
