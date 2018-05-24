package br.edu.utfpr.pb.oficinaweb.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper=true)
/*@NoArgsConstructor
@AllArgsConstructor*/
@PrimaryKeyJoinColumn(referencedColumnName="id")
public class Fornecedor extends Pessoa implements Serializable{

}
