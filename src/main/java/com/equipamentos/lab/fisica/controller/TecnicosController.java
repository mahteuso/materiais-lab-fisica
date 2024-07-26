package com.equipamentos.lab.fisica.controller;

import com.equipamentos.lab.fisica.dto.TecnicosDto;
import com.equipamentos.lab.fisica.model.Tecnicos;
import com.equipamentos.lab.fisica.service.TecnicosService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tecnicos")
public class TecnicosController {


    @Autowired
    private TecnicosService tecnicosService;

    @GetMapping
    public ResponseEntity<List<Tecnicos>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(tecnicosService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tecnicos> finById(@PathParam("id") Integer id) {
        return ResponseEntity.status(HttpStatus.OK).body(tecnicosService.findById(id));
    }

    @PostMapping("/save")
    public ResponseEntity<Tecnicos> save(@RequestBody TecnicosDto dto) {
        return ResponseEntity.status(HttpStatus.OK).body(tecnicosService.save(dto));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Tecnicos> update(@RequestBody TecnicosDto dto, @PathVariable("id") Integer id) {
        return ResponseEntity.status(HttpStatus.OK).body(tecnicosService.update(dto, id));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        tecnicosService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
}
