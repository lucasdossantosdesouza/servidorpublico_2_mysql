package com.abctreinamento.servidorpublico.service;

import com.abctreinamento.servidorpublico.entity.ServidorPublico;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface ServidorPublicoService {

    List<ServidorPublico> listAll() throws IOException;

    Optional<ServidorPublico> listByMatriculaServidorPublico(long matricula) throws IOException;

    void save(ServidorPublico servidorPublico);
    void update(ServidorPublico servidorPublico);
    void delete(ServidorPublico servidorPublico);

}
