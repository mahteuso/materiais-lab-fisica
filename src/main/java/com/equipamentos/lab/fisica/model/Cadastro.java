package com.equipamentos.lab.fisica.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cadastro")
public class Cadastro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JoinColumn(name = "id")
    private Tecnicos tecnicos;


    @JoinColumn(name = "id")
    private Equipamentos equipamentos;

    @Column(name = "data_criacao")
    private LocalDateTime dtCriacao = LocalDateTime.now();
}
