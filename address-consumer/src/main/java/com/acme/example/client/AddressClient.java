package com.acme.example.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
@FeignClient("address-provider")
public interface AddressClient {

    @RequestMapping(method = RequestMethod.GET, value = "/find/{postCode}", consumes = {
	    MediaType.APPLICATION_JSON_VALUE })
    public AddressResponse findByPostCode(@PathVariable("postCode") String postCode);
}
