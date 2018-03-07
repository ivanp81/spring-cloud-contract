package com.acme.example.contract;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

import com.acme.example.Application;
import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
@AutoConfigureStubRunner(ids = {"com.acme.example:address-provider:+:stubs:2222"}, workOffline = true)
public class ContractScenario1Base {

	@Autowired
	private WebApplicationContext context;
	
	@Before
	public void setup() {
		RestAssuredMockMvc.webAppContextSetup(context);
	}

}
