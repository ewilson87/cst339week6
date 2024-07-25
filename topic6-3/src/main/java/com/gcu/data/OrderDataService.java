package com.gcu.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.gcu.data.entity.OrderEntity;
import com.gcu.data.repository.OrdersRepository;

//import javax.sql.DataSource;

@Service
public class OrderDataService implements DataAccessInterface<OrderEntity> {

	@Autowired
	private OrdersRepository ordersRepository;
	
	//@Autowired
	//private DataSource dataSource;
	
	//@Autowired
	//private JdbcTemplate jdbcTemplateObject;
	
	//non default constructor
	public OrderDataService(OrdersRepository ordersRepository) 
	{
		this.ordersRepository = ordersRepository;
		//this.dataSource = dataSource;
		//this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public List<OrderEntity> findAll() {
		List<OrderEntity> orders = new ArrayList<OrderEntity>();
		
		try
		{
			// get all the entity orders
			Iterable<OrderEntity> ordersIterable = ordersRepository.findAll();
			
			// convert to a list and return
			orders = new ArrayList<OrderEntity>();
			ordersIterable.forEach(orders::add);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return orders;
	}

	public OrderEntity findById(String id) {
		return ordersRepository.getOrderById(id);
	}

	public boolean create(OrderEntity order) {
		String sql = "INSERT INTO ORDERS(ORDER_NO, PRODUCT_NAME, PRICE, QUANTITY) VALUES(?, ?, ?, ?)";
		try 
		{
			// EXECUTE SQL INSERT
			//jdbcTemplateObject.update(sql, order.getOrderNo(), order.getProductName(), order.getPrice(), order.getQuantity());
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean update(OrderEntity order) {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean delete(OrderEntity order) {
		// TODO Auto-generated method stub
		return true;
	}

}
