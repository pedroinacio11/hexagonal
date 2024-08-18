package com.phinacio.hexagonal.application.ports.in;

import com.phinacio.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);

}
