package com.pamelamoreiras.testepismo.services.servicesimpl;

import com.pamelamoreiras.testepismo.repositories.AccountRepository;
import com.pamelamoreiras.testepismo.services.AccountService;
import com.pamelamoreiras.testepismo.services.converters.AccountConverter;
import com.pamelamoreiras.testepismo.services.dtos.AccountServiceRequest;
import com.pamelamoreiras.testepismo.services.dtos.AccountServiceResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public AccountServiceResponse create(final AccountServiceRequest accountServiceRequest) {
        final var account = accountRepository.findAccountByDocumentNumber(accountServiceRequest.getDocumentNumber());

        if (account == null) {
            final var accountToCreate = AccountConverter.accountDTOToAccounts(accountServiceRequest);
            accountToCreate.setBalance(1000.0);

            final var createdAccount = accountRepository.save(accountToCreate);

            return AccountConverter.accountsToAccountDTO(createdAccount);
        } else{
            throw new RuntimeException();
        }
    }
}
