package com.lumini.avaliacao.repository;

import com.lumini.avaliacao.model.CompanyAddress;
import org.springframework.stereotype.Service;

@Service
public class CnpjRepositoryImpl implements CnpjRepository {
    @Override
    public CompanyAddress getAddressMock(String cnpj) {

        switch(cnpj.substring(0,1)){
            case "1":
               return setCompany("Rua Doutor José Pedro Consenza","873,Vila Cruzeiro", "SP","Itatiba");
            case "2":
                return   setCompany("Rua Hermes da Fonseca","901,Alves Dias", "SP","São Bernardo do Campo");
            case "3":
                return   setCompany("Rua José Fernandes Teixeira Zuza","537,537", "SP","Carapicuíba");
            case "4":
                return   setCompany("Rua Maria Bovo Marochio","384,Residencial São Marcos", "SP","Presidente Prudente");
            case "5":
                return   setCompany("Rua Salma Tacache Pirillo","486,Jardim Ponte Alta I", "SP","Guarulhos");
            case "6":
                return   setCompany("Rua Carlos Gomes 2180","944,Centro", "SP","Dirce Reis");
            case "7":
                return   setCompany("Rua Geraldo Baldes Leitão","756,Jardim Indaiá", "SP","Tatuí");
            case "8":
                return   setCompany("Rua Moranguaba","113,Copacabana", "SP","São Bernardo do Campo");
            case "9":
                return   setCompany("Rua Carmo do Rio Claro","197,Cambuci", "SP","Arujá");
            default:
                return   setCompany("Avenida Portugal","174,Centro","SP","Santo André");
        }
    }

    private CompanyAddress setCompany(String address,String complement,String State,String city){
        CompanyAddress companyAddress = new CompanyAddress();
        companyAddress.setAddress(address);
        companyAddress.setComplement(complement);
        companyAddress.setState(State);
        companyAddress.setCity(city);

        return companyAddress;
    }
}
