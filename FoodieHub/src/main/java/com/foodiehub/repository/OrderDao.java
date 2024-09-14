package com.foodiehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodiehub.model.OrderDetails;

@Repository
public interface OrderDao extends JpaRepository<OrderDetails, Integer> {

}
