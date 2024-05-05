package com.example.crud.repositories;

import com.example.crud.entities.CepData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CepDataRepository  extends JpaRepository<CepData, String> {
}
