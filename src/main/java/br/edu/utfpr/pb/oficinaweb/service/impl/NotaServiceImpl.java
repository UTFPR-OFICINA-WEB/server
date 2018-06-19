package br.edu.utfpr.pb.oficinaweb.service.impl;

import br.edu.utfpr.pb.oficinaweb.data.NotaData;
import br.edu.utfpr.pb.oficinaweb.model.Nota;
import br.edu.utfpr.pb.oficinaweb.service.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class NotaServiceImpl extends CrudServiceImpl<Nota, Long> implements NotaService {

    @Autowired
    private NotaData notaData;

    @Override
    protected JpaRepository<Nota, Long> getData() {
        return notaData;
    }

    @Override
    public Nota save(Nota nota) {
        if (nota.getItensNota() != null) {
            nota.getItensNota().forEach(e -> {
                e.setNota(nota);
                e.setValorUnitario(e.getProduto().getValor());
            });
        }

        return super.save(nota);
    }
}
