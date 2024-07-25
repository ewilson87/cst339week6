/**
 * 
 */
package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.OrderDataService;
import com.gcu.data.entity.OrderEntity;
import com.gcu.model.OrderModel;

/**
 * 
 */
public class OrdersBusinessService implements OrdersBusinessInterface {

	@Autowired
	private OrderDataService service;
	
	public void test() {
		
		System.out.println("Hello from the OrdersBusinessService ");

	}
	
	public List<OrderModel> getOrders()
	{
		// get all the entity orders
		List<OrderEntity> ordersEntity = service.findAll();
		
		// iterate over the entity orders and create a list of domain orders
		List<OrderModel> ordersDomain = new ArrayList<OrderModel>();
		for(OrderEntity entity : ordersEntity) 
		{
			ordersDomain.add(new OrderModel(entity.getId(), entity.getOrderNo(), entity.getProductName(), entity.getPrice(), entity.getQuantity()));
		}
		
		
		return ordersDomain;
	}
	
	public void init() 
	{
		System.out.println("init method called");
	}
	
	public void destroy() 
	{
		System.out.println("destroy method called");
	}

	@Override
	public OrderModel getOrderById(String id) {
		// get the entity order
		OrderEntity orderEntity = service.findById(id);
		
		// convert entity order to domain order
		return new OrderModel(orderEntity.getId(), orderEntity.getOrderNo(), orderEntity.getProductName(), orderEntity.getPrice(), orderEntity.getQuantity());
	}

}
