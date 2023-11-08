package com.pamelamoreiras.testepismo.services.converters;

import com.pamelamoreiras.testepismo.entities.Accounts;
import com.pamelamoreiras.testepismo.services.dtos.AccountServiceRequest;
import com.pamelamoreiras.testepismo.services.dtos.AccountServiceResponse;

public class AccountConverter {

    public static Accounts accountDTOToAccounts(final AccountServiceRequest accountServiceRequest) {
        return Accounts.builder()
                .id(accountServiceRequest.getId())
                .documentNumber(accountServiceRequest.getDocumentNumber())
                .build();
    }

    public static AccountServiceResponse accountsToAccountDTO(final Accounts accounts) {
        return AccountServiceResponse.builder()
                .id(accounts.getId())
                .documentNumber(accounts.getDocumentNumber())
                .balance(accounts.getBalance())
                .build();
    }
}
