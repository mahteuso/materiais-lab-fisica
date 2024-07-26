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
@Table(name = "equipamentos")
public class Equipamentos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome_equipamento")
    private String nomeEquipamento;

    private String patrimonio;

    @Column(name = "data_insercao")
    private LocalDateTime dtInsercao = LocalDateTime.now();

    private String descricao;

    private Boolean ativo;
}
