package com.phinacio.hexagonal.adapters.in.controller.response;

import com.phinacio.hexagonal.application.core.domain.Address;
import lombok.Data;

@Data
public class CustomerResponse {

    private String name;

    private Address address;

    private String cpf;

    private Boolean isValidCpf;

}
