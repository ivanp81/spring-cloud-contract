package com.acme.example.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
@FeignClient("address-producer")
public interface AddressFeignClient {
    
	@RequestMapping(method = RequestMethod.GET, value = "/address/{postCode}", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public AddressResponse getPostCodeAddress(@PathVariable("postCode") String postCode);
}
