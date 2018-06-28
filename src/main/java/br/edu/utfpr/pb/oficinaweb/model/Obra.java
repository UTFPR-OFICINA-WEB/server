package br.edu.utfpr.pb.oficinaweb.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Local;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Obra implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="DESCRICAO")
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Cliente idCliente;

    @ManyToOne
    @JoinColumn(name = "idCcusto")
    private Ccusto idCcusto;

    @ManyToOne
    @JoinColumn(name = "IDFORNECEDOR")
    private Fornecedor idFornecedor;

    @ManyToOne
    @JoinColumn(name = "IDCIDADE")
    private Cidade idCidade;

    @Column(name="DTINICIO")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate inicio;

    @Column(name="DTFIM")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fim;

    @Column(name="DTINICIOPREVISTO")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate inicioPrevisto;

    @Column(name="DTFIMPREVISTO")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fimPrevisto;

    @Column(name="DTCUSTOTOTAL")
    private Double custoTotal;

}
