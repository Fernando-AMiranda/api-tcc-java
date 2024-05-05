package com.example.crud.client;

import com.example.crud.dtos.CepInfoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ViaCep", url = "viacep.com.br/ws/")
public interface ViaCepAPIClient {

    @GetMapping("{id}/json")
    CepInfoDTO getCep(@PathVariable("id")String id);
}
