package br.edu.utfpr.pb.oficinaweb.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Obra implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(name="DESCRICAO")
    private String descricao;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "idCliente")
    private Cliente idCliente;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "idCcusto")
    private Ccusto idCcusto;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "IDFORNECEDOR")
    private Fornecedor idFornecedor;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "IDLOCAL")
    private Local idLocal;

    @Column(name="DTINICIO")
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate inicio;

    @Column(name="DTFIM")
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fim;

    @Column(name="DTINICIOPREVISTO")
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate inicioPrevisto;

    @Column(name="DTFIMPREVISTO")
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fimPrevisto;

    @Column(name="DTCUSTOTOTAL")
    @NotNull
    private Double custoTotal;

}
