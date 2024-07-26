package com.equipamentos.lab.fisica.service.impl;

import com.equipamentos.lab.fisica.dto.EquipamentosDto;
import com.equipamentos.lab.fisica.model.Equipamentos;
import com.equipamentos.lab.fisica.exception.BadRequestException;
import com.equipamentos.lab.fisica.exception.NotFoundException;
import com.equipamentos.lab.fisica.mapper.EquipamentosMapper;
import com.equipamentos.lab.fisica.repository.EquipamentosRepository;
import com.equipamentos.lab.fisica.service.EquipamentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EquipamentosServiceImpl implements EquipamentosService {

    @Autowired
    private EquipamentosRepository equipamentosRepository;

    @Override
    public Equipamentos save(EquipamentosDto dto) {
        if (Objects.nonNull(dto.getId())){
           throw new BadRequestException("The id can't be send here");
        }
        return equipamentosRepository.save(EquipamentosMapper.fromDtoToEntity(dto));
    }

    @Override
    public List<Equipamentos> findAll() {
        return equipamentosRepository.findAll();
    }

    @Override
    public Equipamentos findById(Integer id) {
        return idIsValid(id);
    }

    @Override
    public Equipamentos update(EquipamentosDto dto, Integer id) {
        idIsValid(id);
        return equipamentosRepository.save(EquipamentosMapper.fromDtoToEntity(dto));
    }

    @Override
    public void delete(Integer id) {
        idIsValid(id);
        equipamentosRepository.deleteById(id);
    }

    public Equipamentos idIsValid(Integer id){
        Optional<Equipamentos> opt = equipamentosRepository.findById(id);
        if (opt.isEmpty()){
            throw new NotFoundException("Equipamentos not found");
        }
        return opt.get();
    }
}
