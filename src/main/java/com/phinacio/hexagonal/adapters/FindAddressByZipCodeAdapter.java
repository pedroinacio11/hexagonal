package com.phinacio.hexagonal.adapters;

import com.phinacio.hexagonal.adapters.out.client.FindAddressZipCodeClient;
import com.phinacio.hexagonal.adapters.out.client.mapper.AddressResponseMapper;
import com.phinacio.hexagonal.application.core.domain.Address;
import com.phinacio.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressZipCodeClient findAddressZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressReponse = findAddressZipCodeClient.find(zipCode);

        return addressResponseMapper.toAddress(addressReponse);
    }
}
