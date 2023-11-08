package com.pamelamoreiras.testepismo.services;

import com.pamelamoreiras.testepismo.services.dtos.AccountServiceRequest;
import com.pamelamoreiras.testepismo.services.dtos.AccountServiceResponse;

public interface AccountService {

    AccountServiceResponse create(final AccountServiceRequest accountServiceRequest);
}
