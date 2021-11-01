package com.lumini.avaliacao.service.Impl;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import com.lumini.avaliacao.error.InvalidParameterException;
import com.lumini.avaliacao.service.UtilService;
import com.lumini.avaliacao.model.CompanyAddress;
import com.lumini.avaliacao.repository.CnpjRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilServiceImpl implements UtilService {

    @Autowired
    CnpjRepository cnpjRepository;

    @Override
    public CompanyAddress getAddress(String companyDocument) {
        CompanyAddress companyAddress = new CompanyAddress();
        if(isValidCNPJ(companyDocument)){
        return cnpjRepository.getAddressMock(companyDocument);
        }
        return companyAddress;
    }

    private static boolean isValidCNPJ(String cnpj) {
        try {
            CNPJValidator validator = new CNPJValidator();
            validator.assertValid(cnpj);
        } catch (InvalidStateException e) {
            throw new InvalidParameterException("CNPJ INVÁLIDO");
        }
    return true;
    }

}
