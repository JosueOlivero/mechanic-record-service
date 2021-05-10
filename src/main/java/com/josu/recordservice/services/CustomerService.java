package com.josu.recordservice.services;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.josu.recordservice.Car;
import com.josu.recordservice.Customer;

@Service
public class CustomerService {
	private Car car1 = null;
	private Customer obj = null;

	public CustomerService() {

		this.car1 = new Car();
		car1.setCarBrand("Hyundai");
		car1.setCarModel("");

		this.obj = new Customer();
		obj.setFirstName("Pepe");
		obj.setLastName("Grillo");
		
	}
	
	

}
