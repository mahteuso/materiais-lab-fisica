package com.equipamentos.lab.fisica.mapper;


import com.equipamentos.lab.fisica.dto.EquipamentosDto;
import com.equipamentos.lab.fisica.model.Equipamentos;

public class EquipamentosMapper {

    public static Equipamentos fromDtoToEntity(EquipamentosDto dto){
        return Equipamentos.builder()
                .id(dto.getId())
                .nomeEquipamento(dto.getNomeEquipamento())
                .patrimonio(dto.getPatrimonio())
                .dtInsercao(dto.getDtInsercao())
                .descricao(dto.getDescricao())
                .ativo(dto.getAtivo())
                .build();
    }
}
