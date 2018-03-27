package com.acme.example.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.acme.example.domain.model.PostcodeAddresses;
import com.acme.example.helper.FileLoader;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class AddressController {

	@RequestMapping(value = "/addresses/{postcode}", method = RequestMethod.GET)
    public PostcodeAddresses getAddressesByPostCode(@PathVariable String postcode) throws Exception {

		String jsonAddress = FileLoader.read("classpath:addresses.json");
        return new ObjectMapper().readValue(jsonAddress, PostcodeAddresses.class);
    }
}