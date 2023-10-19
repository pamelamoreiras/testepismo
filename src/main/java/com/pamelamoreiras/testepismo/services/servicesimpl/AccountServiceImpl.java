package com.pamelamoreiras.testepismo.services.servicesimpl;

import com.pamelamoreiras.testepismo.repositories.AccountRepository;
import com.pamelamoreiras.testepismo.services.AccountService;
import com.pamelamoreiras.testepismo.services.converters.AccountConverter;
import com.pamelamoreiras.testepismo.services.dtos.AccountDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public AccountDTO create(final AccountDTO accountDTO) {
        final var accountToCreate = AccountConverter.accountDTOToAccounts(accountDTO);
        final var createdAccount = accountRepository.save(accountToCreate);

        return AccountConverter.accountsToAccountDTO(createdAccount);
    }
}
