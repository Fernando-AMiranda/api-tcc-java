package com.example.crud.repositories;

import com.example.crud.entities.CepInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CepRepository extends JpaRepository<CepInfo, String> {
}
