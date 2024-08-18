package com.phinacio.hexagonal.application.ports.in;

import com.phinacio.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
