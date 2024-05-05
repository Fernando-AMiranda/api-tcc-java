package com.example.crud.dtos;

import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CepInfoDTO {

    private String idEndereco;
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
