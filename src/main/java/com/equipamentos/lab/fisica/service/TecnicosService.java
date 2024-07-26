package com.equipamentos.lab.fisica.service;

import com.equipamentos.lab.fisica.dto.TecnicosDto;
import com.equipamentos.lab.fisica.model.Tecnicos;

import java.util.List;

public interface TecnicosService {

    Tecnicos save(TecnicosDto dto);

    List<Tecnicos> findAll();

    Tecnicos findById(Integer id);

    Tecnicos update(TecnicosDto dto, Integer id);

    void delete(Integer id);
}
