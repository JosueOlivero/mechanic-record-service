package com.josu.recordservice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class getCustomerController {
	
	@RequestMapping("/getCustomer")
	public String getCustomer() {
		return "Customer";
	}

}
