package com.gcu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.business.OrdersBusinessInterface;
//import com.gcu.business.SecurityBusinessService;
//import com.gcu.model.LoginModel;
import com.gcu.model.OrderModel;

import jakarta.validation.Valid;

@Controller
//@RequestMapping("/")
public class LoginController {

    @Autowired
    private OrdersBusinessInterface service;
    
	/*
	 * @Autowired private SecurityBusinessService security;
	 */
    
    @GetMapping
    public String displayHome(Model model) {
        // Display Login Form View
        model.addAttribute("title", "Login Form");
        //model.addAttribute("loginModel", new LoginModel());
        return "login";
    }

    @GetMapping("/login")
    public String displayLogin(Model model) {
    	String pass = "pass";
    	String encoded = new BCryptPasswordEncoder().encode(pass);
    	System.out.println(encoded);
    	
        // Display Login Form View
        model.addAttribute("title", "Login Form");
        //model.addAttribute("loginModel", new LoginModel());
        return "login";
    }

	/*
	 * @PostMapping("/doLogin") public String doLogin(@Valid LoginModel loginModel,
	 * BindingResult bindingResult, Model model) { // Print the form values out
	 * System.out.println(String.
	 * format("Form with Username of %s and Password of %s",
	 * loginModel.getUsername(), loginModel.getPassword()));
	 * 
	 * // check for validation if (bindingResult.hasErrors()) {
	 * model.addAttribute("title", "Login Form"); return "Login"; }
	 * 
	 * // Call the service test() method service.test();
	 * 
	 * // Call the security authenticate method security.authenticate(null, null);
	 * 
	 * // Call the getOrders and save to orders list //Refactored straight into the
	 * addAttribute below //List<OrderModel> orders = service.getOrders();
	 * 
	 * 
	 * // Set model attributes model.addAttribute("title", "My Orders");
	 * model.addAttribute("orders", service.getOrders());
	 * 
	 * // Return the view name return "orders"; }
	 */
    
    @GetMapping("/orders")
    public String orders(Model model) {
    	System.out.println("reached orders method");
    	//Set model attributes
        model.addAttribute("title", "My Orders");
        model.addAttribute("orders", service.getOrders());
    	
        return "orders";
    }

}
