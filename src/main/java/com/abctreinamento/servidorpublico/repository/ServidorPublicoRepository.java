package com.abctreinamento.servidorpublico.repository;

import com.abctreinamento.servidorpublico.entity.ServidorPublico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServidorPublicoRepository extends CrudRepository<ServidorPublico, Long> {
}
