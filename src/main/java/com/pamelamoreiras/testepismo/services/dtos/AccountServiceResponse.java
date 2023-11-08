package com.pamelamoreiras.testepismo.services.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountServiceResponse {

    private Integer id;
    private String documentNumber;
    private Double balance;
}
