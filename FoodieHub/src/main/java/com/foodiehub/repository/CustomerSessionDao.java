package com.foodiehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodiehub.model.CustomerSession;

@Repository
public interface CustomerSessionDao extends JpaRepository<CustomerSession, Integer>{
	public CustomerSession findByUniqueId(String uniqueId);
}
