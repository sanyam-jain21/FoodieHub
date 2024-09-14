package com.foodiehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodiehub.model.FoodCart;

@Repository
public interface CartDao extends JpaRepository<FoodCart, Integer> {
	public FoodCart findByCustumerId(Integer customerId);

}
