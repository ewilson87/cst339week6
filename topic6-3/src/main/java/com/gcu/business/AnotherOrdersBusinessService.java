/**
 * 
 */
package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import com.gcu.model.OrderModel;

/**
 * 
 */
public class AnotherOrdersBusinessService implements OrdersBusinessInterface {

	public void test() {
		
		System.out.println("Hello from the AnotherOrdersBusinessService ");

	}
	
	public List<OrderModel> getOrders()
	{
		// Create some Orders
        List<OrderModel> orders = new ArrayList<OrderModel>();
        orders.add(new OrderModel("1", "000000001", "Product 1", 1.00f, 1));
        orders.add(new OrderModel("2", "000000002", "Product 2", 2.00f, 2));
        orders.add(new OrderModel("3", "000000003", "Product 3", 3.00f, 3));
        orders.add(new OrderModel("4", "000000004", "Product 4", 4.00f, 4));
        orders.add(new OrderModel("5", "000000005", "Product 5", 5.00f, 5));
        
        return orders;
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
		// TODO Auto-generated method stub
		return null;
	}

}
