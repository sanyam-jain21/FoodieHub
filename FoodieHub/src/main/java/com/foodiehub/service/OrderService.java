package com.foodiehub.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.foodiehub.exception.OrderException;
import com.foodiehub.model.Customer;
import com.foodiehub.model.OrderDetails;
import com.foodiehub.model.Restaurants;

@Service
public interface OrderService {
	// 6 customer ====>// place your order
	public OrderDetails addOrder(Integer cartId, String uniqueId) throws OrderException;

	public OrderDetails removeOrder(OrderDetails order) throws OrderException;

	public OrderDetails updateOrder(OrderDetails order) throws OrderException;

	public OrderDetails viewOrder(OrderDetails order) throws OrderException;

	public List<OrderDetails> viewAllOrders(Restaurants res) throws OrderException;

	public List<OrderDetails> viewAllOrders(Customer customer) throws OrderException;

}
