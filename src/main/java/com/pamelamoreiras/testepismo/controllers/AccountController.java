package com.pamelamoreiras.testepismo.controllers;

import com.pamelamoreiras.testepismo.services.AccountService;
import com.pamelamoreiras.testepismo.services.dtos.AccountDTO;
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
    public AccountDTO create(@RequestBody final AccountDTO accountDTO) {
        return accountService.create(accountDTO);
    }
}
