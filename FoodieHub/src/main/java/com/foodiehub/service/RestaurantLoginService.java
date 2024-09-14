package com.foodiehub.service;

import org.springframework.stereotype.Service;

import com.foodiehub.exception.RestaurantLoginException;
import com.foodiehub.model.RestaurantLoginDTO;

@Service
public interface RestaurantLoginService {
	public String restaurantLogin(RestaurantLoginDTO dto) throws RestaurantLoginException;

    public String restaurantLogout(String uniqueId) throws RestaurantLoginException;
}
