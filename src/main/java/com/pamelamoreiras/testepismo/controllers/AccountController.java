package com.pamelamoreiras.testepismo.controllers;

import com.pamelamoreiras.testepismo.services.AccountService;
import com.pamelamoreiras.testepismo.services.dtos.AccountServiceRequest;
import com.pamelamoreiras.testepismo.services.dtos.AccountServiceResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @PostMapping
    public AccountServiceResponse create(@RequestBody final AccountServiceRequest accountServiceRequest) {
        return accountService.create(accountServiceRequest);
    }
}
