package com.equipamentos.lab.fisica.service;

import com.equipamentos.lab.fisica.model.Cadastro;

import java.util.List;

public interface CadastroService {

    Cadastro save(Cadastro cadastro);

    List<Cadastro> findAll();

    Cadastro findById(Integer id);

    void delete(Integer id);
}
