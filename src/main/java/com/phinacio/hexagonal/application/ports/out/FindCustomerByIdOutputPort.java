package com.phinacio.hexagonal.application.ports.out;

import com.phinacio.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);

}
