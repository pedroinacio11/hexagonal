package com.phinacio.hexagonal.application.core.usecase;

import com.phinacio.hexagonal.application.core.domain.Customer;
import com.phinacio.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.phinacio.hexagonal.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    @Autowired
    public Customer find(String id) {
        return findCustomerByIdOutputPort.find(id).
                orElseThrow(() -> new RuntimeException("Customer not found"));
    }

}
