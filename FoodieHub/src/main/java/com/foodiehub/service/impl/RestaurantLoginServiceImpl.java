package com.foodiehub.service.impl;

import java.time.LocalDateTime;
import java.util.Optional;

import com.foodiehub.service.RestaurantLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodiehub.exception.RestaurantLoginException;
import com.foodiehub.model.RestaurantLoginDTO;
import com.foodiehub.model.RestaurantSession;
import com.foodiehub.model.Restaurants;
import com.foodiehub.repository.RestaurantDao;
import com.foodiehub.repository.RestaurantSessionDao;

import net.bytebuddy.utility.RandomString;

@Service
public class RestaurantLoginServiceImpl implements RestaurantLoginService {
	
	@Autowired
	private RestaurantDao rDao;
	
	@Autowired
	private RestaurantSessionDao rSDao;

	@Override
	public String restaurantLogin(RestaurantLoginDTO dto) throws RestaurantLoginException {
		
		Restaurants existingRestaurant = rDao.findByContactNumber(dto.getContactNumber());
		
		if(existingRestaurant==null) {
			throw new RestaurantLoginException("Please enter a valid mobile number!");
		}
		
		Optional<RestaurantSession> opt = rSDao.findById(existingRestaurant.getRestaurantId());
		
		if(opt.isPresent()) {
			throw new RestaurantLoginException("Restaurant already logged in!");
		}
		
		if(existingRestaurant.getPassword().equals(dto.getPassword())) {
			
			RestaurantSession restaurantSession = new RestaurantSession(existingRestaurant.getRestaurantId(),RandomString.make(8),LocalDateTime.now());
			
			rSDao.save(restaurantSession);
			
			return restaurantSession.toString();
			
		}else {
			throw new RestaurantLoginException("Please enter a valid password!");
		}
		
	}

	@Override
	public String restaurantLogout(String uniqueId) throws RestaurantLoginException {
		RestaurantSession validRestaurant = rSDao.findByUniqueId(uniqueId);
		if(validRestaurant==null) {
			throw new RestaurantLoginException("Restaurant didn't sign in with this number!");
		}
		
		rSDao.delete(validRestaurant);
		
		return "Logged out!";
	}

}
