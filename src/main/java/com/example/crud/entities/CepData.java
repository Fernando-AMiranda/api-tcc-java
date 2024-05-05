package com.example.crud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="cep")
@Entity(name="cep")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CepData {

    @Id
    private Integer id_cep;
    private String cep;
}
