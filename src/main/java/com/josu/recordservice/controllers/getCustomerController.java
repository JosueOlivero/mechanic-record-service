package com.josu.recordservice.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.josu.recordservice.dto.CustomerDTO;

@RestController
@ResponseBody
public class getCustomerController {
	
	@RequestMapping("/getCustomer")
	public ResponseEntity<CustomerDTO> getCustomer() {
		return new ResponseEntity<>(new CustomerDTO(), HttpStatus.OK);
	}

}
