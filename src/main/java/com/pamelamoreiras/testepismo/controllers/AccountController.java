package com.pamelamoreiras.testepismo.controllers;

import com.pamelamoreiras.testepismo.services.AccountService;
import com.pamelamoreiras.testepismo.services.dtos.AccountServiceRequest;
import com.pamelamoreiras.testepismo.services.dtos.AccountServiceResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @PostMapping
    public AccountServiceResponse create(@RequestBody final AccountServiceRequest accountServiceRequest) {
        return accountService.create(accountServiceRequest);
    }

    @GetMapping("/{id}")
    public AccountServiceResponse getAccount(@PathVariable final Integer id) {
        return accountService.getAccount(id);
    }
}
