package com.acme.example.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.acme.example.helper.FileLoader;
import com.acme.example.model.Address;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class AddressController {

	@RequestMapping(value = "/address/{postCode}", method = RequestMethod.GET)
    public Address getAddressesByPostCode(@PathVariable String postCode) throws Exception {

		String jsonAddress = FileLoader.read("classpath:address.json");
        return new ObjectMapper().readValue(jsonAddress, Address.class);
    }
}