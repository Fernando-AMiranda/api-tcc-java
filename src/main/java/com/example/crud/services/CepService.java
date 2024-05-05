package com.example.crud.services;

import com.example.crud.client.ViaCepAPIClient;
import com.example.crud.dtos.CepInfoDTO;
import com.example.crud.dtos.RespostaRotinaDTO;
import com.example.crud.entities.CepData;
import com.example.crud.entities.CepInfo;
import com.example.crud.repositories.CepDataRepository;
import com.example.crud.repositories.CepRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class CepService {
    private static final Logger logger = LogManager.getLogger(CepService.class);


    @Autowired
    private CepRepository repository;

    @Autowired
    private CepDataRepository rep;

    @Autowired
    private ViaCepAPIClient client;

    public List<CepData> getAllCeps() {
        return rep.findAll();
    }

    public CepInfoDTO testGetCep() {
        return client.getCep("14825150");
    }

    public RespostaRotinaDTO rotinaInserirCeps() {
        logger.info(">>>>> Início da rotina");
        RespostaRotinaDTO resposta = new RespostaRotinaDTO();

        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String inicio = agora.format(formatter);

        resposta.setInicioRotina(inicio);


        List<CepData> ceps = rep.findAll();

        for (CepData cep : ceps) {
            CepInfoDTO respostaAPI = client.getCep(cep.getCep());
            CepInfo cepData = new CepInfo(null, respostaAPI.getCep(), respostaAPI.getLogradouro(), respostaAPI.getBairro(), respostaAPI.getLocalidade(), respostaAPI.getUf(), respostaAPI.getDdd(), respostaAPI.getIbge(), respostaAPI.getGia(), respostaAPI.getSiafi());
            repository.save(cepData);
        }

        agora = LocalDateTime.now();
        String fim =  agora.format(formatter);
        resposta.setFinalRotina(fim);
        logger.info(">>>>>> Final da rotina!");

        return resposta;






    }
}
