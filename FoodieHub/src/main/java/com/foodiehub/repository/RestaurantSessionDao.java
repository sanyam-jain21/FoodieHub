package com.foodiehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodiehub.model.RestaurantSession;

@Repository
public interface RestaurantSessionDao extends JpaRepository<RestaurantSession, Integer>{
	public RestaurantSession findByUniqueId(String uniqueId);
}
