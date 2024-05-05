package com.example.crud.entities;

import lombok.*;

import javax.persistence.*;

@Table(name="endereco")
@Entity(name="endereco")
@EqualsAndHashCode(of="id_endereco")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CepInfo {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id_endereco;
    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;
    private String ddd;
    private String ibge;
    private String gia;
    private String siafi;
}
