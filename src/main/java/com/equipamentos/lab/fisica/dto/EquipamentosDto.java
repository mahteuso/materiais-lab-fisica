package com.equipamentos.lab.fisica.dto;


import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EquipamentosDto {

    private Integer id;

    private String nomeEquipamento;

    private String patrimonio;

    private LocalDateTime dtInsercao = LocalDateTime.now();

    private String descricao;

    private Boolean ativo;
}
