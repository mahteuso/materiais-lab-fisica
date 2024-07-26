package com.equipamentos.lab.fisica.controller;

import com.equipamentos.lab.fisica.dto.EquipamentosDto;
import com.equipamentos.lab.fisica.model.Equipamentos;
import com.equipamentos.lab.fisica.service.EquipamentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipamentos")
public class EquipamentosController {

    @Autowired
    private EquipamentosService equipamentosService;

    @GetMapping
    public ResponseEntity<List<Equipamentos>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(equipamentosService.findAll());
    }

    @PostMapping("/save")
    public ResponseEntity<Equipamentos> save(@RequestBody EquipamentosDto dto){
        return ResponseEntity.status(HttpStatus.OK).body(equipamentosService.save(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Equipamentos> findById(@PathVariable("id") Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(equipamentosService.findById(id));
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<Equipamentos> update(@RequestBody EquipamentosDto dto, @PathVariable("id") Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(equipamentosService.update(dto, id));
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id){
        equipamentosService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
}
