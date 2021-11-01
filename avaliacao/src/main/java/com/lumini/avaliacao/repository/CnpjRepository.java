package com.lumini.avaliacao.repository;

import com.lumini.avaliacao.model.CompanyAddress;

public interface CnpjRepository {
    CompanyAddress getAddressMock(String cnpj);
}
