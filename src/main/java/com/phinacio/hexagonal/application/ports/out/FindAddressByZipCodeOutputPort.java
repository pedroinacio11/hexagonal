package com.phinacio.hexagonal.application.ports.out;

import com.phinacio.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);

}
