package com.gcu.data.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.gcu.data.entity.OrderEntity;


public interface OrdersRepository extends MongoRepository<OrderEntity, String> {

	@Override
	@Query(value = "SELECT * FROM ORDERS")
	public List<OrderEntity> findAll();
	
	OrderEntity getOrderById(String id);
}
