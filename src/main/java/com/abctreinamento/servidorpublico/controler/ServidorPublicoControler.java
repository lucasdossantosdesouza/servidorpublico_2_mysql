package com.abctreinamento.servidorpublico.controler;

import com.abctreinamento.servidorpublico.entity.ServidorPublico;
import com.abctreinamento.servidorpublico.service.ServidorPublicoService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
public class ServidorPublicoControler {

    private ServidorPublicoService servidorPublicoService;


    @GetMapping("/list")
    public List<ServidorPublico> listAll(){
        try {
            return servidorPublicoService.listAll();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @GetMapping("/list/{matricula}")
    public Optional<ServidorPublico> listByMatriculaServidorPublico(@PathVariable Long matricula){
        try {
            return servidorPublicoService.listByMatriculaServidorPublico(matricula);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Autowired
    private void setServidorPublicoService(ServidorPublicoService servidorPublicoService){
        this.servidorPublicoService = servidorPublicoService;
    }
}
