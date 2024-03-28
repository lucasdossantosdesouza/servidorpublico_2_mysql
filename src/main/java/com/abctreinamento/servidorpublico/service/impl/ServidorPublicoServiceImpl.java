package com.abctreinamento.servidorpublico.service.impl;

import com.abctreinamento.servidorpublico.entity.ServidorPublico;
import com.abctreinamento.servidorpublico.repository.ServidorPublicoRepository;
import com.abctreinamento.servidorpublico.service.ServidorPublicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ServidorPublicoServiceImpl implements ServidorPublicoService {

    @Autowired
    private ServidorPublicoRepository servidorPublicoRepository;
    @Override
    public List<ServidorPublico> listAll() throws IOException {

        List<ServidorPublico> servidoresPublicos = new ArrayList<>();
        servidorPublicoRepository.findAll().forEach(servidoresPublicos::add);
        return servidoresPublicos;
    }

    @Override
    public Optional<ServidorPublico> listByMatriculaServidorPublico(long matricula) throws IOException {
        return servidorPublicoRepository.findById(matricula);
    }

    @Override
    public void save(ServidorPublico servidorPublico) {
        servidorPublicoRepository.save(servidorPublico);
    }

    @Override
    public void update(ServidorPublico servidorPublico) {
        servidorPublicoRepository.save(servidorPublico);
    }

    @Override
    public void delete(ServidorPublico servidorPublico) {
        servidorPublicoRepository.delete(servidorPublico);
    }
}
