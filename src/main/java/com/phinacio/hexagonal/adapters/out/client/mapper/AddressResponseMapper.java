package com.phinacio.hexagonal.adapters.out.client.mapper;

import com.phinacio.hexagonal.adapters.out.client.response.AddressResponse;
import com.phinacio.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);


}
