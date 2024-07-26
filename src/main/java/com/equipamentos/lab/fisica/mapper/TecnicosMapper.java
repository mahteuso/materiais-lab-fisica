package com.equipamentos.lab.fisica.mapper;

import com.equipamentos.lab.fisica.dto.TecnicosDto;
import com.equipamentos.lab.fisica.model.Tecnicos;

public class TecnicosMapper {

    public static Tecnicos fromDtoToEntity(TecnicosDto dto) {
        return Tecnicos.builder()
                .id(dto.getId())
                .nome(dto.getNome())
                .departamento(dto.getDepartamento())
                .ativo(dto.getAtivo())
                .build();
    }
}
