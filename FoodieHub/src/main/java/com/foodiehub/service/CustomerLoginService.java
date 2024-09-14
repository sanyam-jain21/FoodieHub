package com.foodiehub.service;

import org.springframework.stereotype.Service;

import com.foodiehub.exception.CustomerLoginException;
import com.foodiehub.model.CustomerLoginDTO;

@Service
public interface CustomerLoginService {
	public String customerLogin(CustomerLoginDTO dto) throws CustomerLoginException;
	
	public String customerLogout(String uniqueId) throws CustomerLoginException;
}
