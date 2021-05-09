package com.josu.recordservice.mappers;

import org.modelmapper.ModelMapper;

import com.josu.recordservice.dto.CustomerDTO;

public class CustomerDTOMapper {

	CustomerDTO customer = new CustomerDTO();	
	ModelMapper modelMapper = new ModelMapper();
	
	CustomerDTO dto = modelMapper.map(customer, CustomerDTO.class);
}
