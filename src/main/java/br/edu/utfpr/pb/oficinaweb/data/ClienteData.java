package br.edu.utfpr.pb.oficinaweb.data;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.utfpr.pb.oficinaweb.model.Cliente;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteData extends JpaRepository<Cliente, Long> {

    @Query(value = "SELECT * FROM PESSOA\n" +
            "INNER JOIN CLIENTE\n" +
            "ON PESSOA.ID = CLIENTE.ID\n" +
            "WHERE PESSOA.ATIVO = 'true'", nativeQuery = true)
    List<Cliente> findByClienteAtivo();
}
