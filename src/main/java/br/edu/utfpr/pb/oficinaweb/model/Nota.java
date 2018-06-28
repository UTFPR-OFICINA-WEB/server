package br.edu.utfpr.pb.oficinaweb.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

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


    //@ManyToOne(fetch = FetchType.EAGER)
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_pessoa", referencedColumnName = "id")
    private Cliente cliente;

}
