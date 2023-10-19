package com.pamelamoreiras.testepismo.services.servicesimpl;

import com.pamelamoreiras.testepismo.repositories.AccountRepository;
import com.pamelamoreiras.testepismo.services.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
}
