package com.equipamentos.lab.fisica.service;

import com.equipamentos.lab.fisica.dto.EquipamentosDto;
import com.equipamentos.lab.fisica.model.Equipamentos;

import java.util.List;


public interface EquipamentosService {

    Equipamentos save(EquipamentosDto dto);

    List<Equipamentos> findAll();

    Equipamentos findById(Integer id);

    Equipamentos update(EquipamentosDto dto, Integer id);

    void delete(Integer id);
}
