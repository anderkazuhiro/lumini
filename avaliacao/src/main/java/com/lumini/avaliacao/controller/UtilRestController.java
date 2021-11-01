package com.lumini.avaliacao.controller;

import com.lumini.avaliacao.service.UtilService;
import com.lumini.avaliacao.model.CompanyAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/util/")
public class UtilRestController {

    @Autowired
    UtilService service;


    @GetMapping(value="address/{cnpj}",produces = {"application/json","application/xml"})
    public CompanyAddress getAddress(@PathVariable("cnpj") String cnpj) {
        return service.getAddress(cnpj);
    }

    @PostMapping(value="average/{firstValue}/{secondValue}",produces = {"application/json","application/xml"})
    public ResponseEntity<String> getAverageValue(@PathVariable("firstValue") Double firstValue,@PathVariable("secondValue") Double secondValue) {
        Double averageValue = (firstValue + secondValue)/2;
        return new ResponseEntity<String>("valor médio: " + averageValue, HttpStatus.OK);

    }

}
