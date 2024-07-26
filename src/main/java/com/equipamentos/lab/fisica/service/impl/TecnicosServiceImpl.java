package com.equipamentos.lab.fisica.service.impl;

import com.equipamentos.lab.fisica.dto.TecnicosDto;
import com.equipamentos.lab.fisica.exception.BadRequestException;
import com.equipamentos.lab.fisica.exception.NotFoundException;
import com.equipamentos.lab.fisica.mapper.TecnicosMapper;
import com.equipamentos.lab.fisica.model.Tecnicos;
import com.equipamentos.lab.fisica.repository.TecnicosRepository;
import com.equipamentos.lab.fisica.service.TecnicosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class TecnicosServiceImpl implements TecnicosService {

    @Autowired
    private TecnicosRepository tecnicosRepository;

    @Override
    public Tecnicos save(TecnicosDto dto) {
        if (Objects.nonNull(dto.getId())) {
            throw new BadRequestException("The id shouldn't be send");
        }
        return tecnicosRepository.save(TecnicosMapper.fromDtoToEntity(dto));
    }

    @Override
    public List<Tecnicos> findAll() {
        return tecnicosRepository.findAll();
    }

    @Override
    public Tecnicos findById(Integer id) {
        return idIsValid(id);
    }

    @Override
    public Tecnicos update(TecnicosDto dto, Integer id) {
        idIsValid(id);
        return tecnicosRepository.save(TecnicosMapper.fromDtoToEntity(dto));
    }

    @Override
    public void delete(Integer id) {
        idIsValid(id);
        tecnicosRepository.deleteById(id);
    }

    public Tecnicos idIsValid(Integer id) {
        Optional<Tecnicos> opt = tecnicosRepository.findById(id);
        if (opt.isEmpty()) {
            throw new NotFoundException("Tecnico not found");
        }
        return opt.get();
    }
}
