package com.equipamentos.lab.fisica.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TecnicosDto {

    private Integer id;

    private String nome;

    private String departamento;

    private Boolean ativo;
}
