package com.equipamentos.lab.fisica.repository;

import com.equipamentos.lab.fisica.model.Tecnicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnicosRepository extends JpaRepository<Tecnicos, Integer> {
}
