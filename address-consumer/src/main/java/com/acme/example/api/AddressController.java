package com.acme.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.acme.example.client.AddressClient;
import com.acme.example.client.AddressResponse;

@RestController
public class AddressController {

    private AddressClient addressClient;

    @Autowired
    public AddressController(AddressClient addressClient) {
	this.addressClient = addressClient;
    }

    @RequestMapping(value = "/find/{postCode}", method = RequestMethod.GET)
    public AddressResponse findByPostCode(@PathVariable String postCode) {
	return addressClient.findByPostCode(postCode);
    }
}