package br.edu.utfpr.pb.oficinaweb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Devolucao implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "idConsumoObra", referencedColumnName = "id")
    private ConsumoObra consumoObra;

    @Min(0)
    @Max(100000)
    @Column(nullable = false)
    private Long qtd;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date data;

}
