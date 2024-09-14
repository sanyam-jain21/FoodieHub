package com.foodiehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodiehub.model.Bill;

@Repository
public interface BillDao extends JpaRepository<Bill, Integer> {

}
