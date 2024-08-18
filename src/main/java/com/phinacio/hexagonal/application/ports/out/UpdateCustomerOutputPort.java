package com.phinacio.hexagonal.application.ports.out;

import com.phinacio.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);

}
