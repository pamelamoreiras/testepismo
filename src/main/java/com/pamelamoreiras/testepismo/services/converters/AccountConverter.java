package com.pamelamoreiras.testepismo.services.converters;

import com.pamelamoreiras.testepismo.entities.Accounts;
import com.pamelamoreiras.testepismo.services.dtos.AccountDTO;

public class AccountConverter {

    public static Accounts accountDTOToAccounts(final AccountDTO accountDTO) {
        return Accounts.builder()
                .id(accountDTO.getId())
                .documentNumber(accountDTO.getDocumentNumber())
                .build();
    }

    public static AccountDTO accountsToAccountDTO(final Accounts accounts) {
        return AccountDTO.builder()
                .id(accounts.getId())
                .documentNumber(accounts.getDocumentNumber())
                .build();
    }
}
