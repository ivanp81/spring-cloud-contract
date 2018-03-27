package com.acme.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.acme.example.client.AddressClient;
import com.acme.example.client.AddressResponse;

@RestController
public class PostcodeController {

    private final AddressClient addressClient;
    
    @Autowired
	public PostcodeController(AddressClient addressClient) {
		super();
		this.addressClient = addressClient;
	}

	@RequestMapping(value = "/postcode/{postcode}/addresses", method = RequestMethod.GET)
    public AddressResponse getPostCodeAddresses(@PathVariable String postcode) {

        return addressClient.getAddresses(postcode);
    }
}