package com.equipamentos.lab.fisica.repository;

import com.equipamentos.lab.fisica.model.Equipamentos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipamentosRepository extends JpaRepository<Equipamentos, Integer> {
}
