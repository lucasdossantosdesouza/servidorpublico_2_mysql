package com.abctreinamento.servidorpublico.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "servidorpublico")
@Data
public class ServidorPublico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long matricula;
    private String nome;
    private String foto;
    private String orgao;
    private String vinculo;
    private String cargo;
    private String lotacao;
    private String exercicio;
    private String email;
    private String telefone;
    private String celular;
    private String cpf;
    private String naturalidade;
}
