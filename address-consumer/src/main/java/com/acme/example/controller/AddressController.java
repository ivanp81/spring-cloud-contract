package com.acme.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.acme.example.client.AddressFeignClient;
import com.acme.example.client.AddressResponse;

@RestController
public class AddressController {

    private final AddressFeignClient addressFeignClient;
    
    @Autowired
	public AddressController(AddressFeignClient addressFeignClient) {
		super();
		this.addressFeignClient = addressFeignClient;
	}

	@RequestMapping(value = "/address/{postCode}", method = RequestMethod.GET)
    public AddressResponse getAddress(@PathVariable String postCode) {

        return addressFeignClient.getPostCodeAddress(postCode);
    }
}