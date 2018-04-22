package com.acme.example.api;

import java.util.Arrays;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.acme.example.domain.model.AddressResponse;

@RestController
public class AddressController {

    @RequestMapping(value = "/find/{postCode}", method = RequestMethod.GET)
    public AddressResponse findByPostCode(@PathVariable String postCode) throws Exception {

	return new AddressResponse.Builder().withLatitude(51.39020538330078).withLongitude(-0.1320359706878662)
		.withAddresses(Arrays.asList("10 Watkin Terrace, , , , , Northampton, Northamptonshire",
			"12 Watkin Terrace, , , , , Northampton, Northamptonshire"))
		.build();

    }
}