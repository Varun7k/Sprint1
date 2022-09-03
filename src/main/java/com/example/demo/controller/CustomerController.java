package com.example.demo.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;


@Controller
public class CustomerController {
	@Autowired
	CustomerRepository customerRepo;
	
	
	@GetMapping("")
	public String veiwHomePage() {
		return "index";
	}
	
	@GetMapping("/register")
	public String showSignUpForm(Model model) {
		model.addAttribute("customer", new Customer());
		
		return "singup_form";
	}
	
	@PostMapping("/process_register")
	public String processRegister(Customer customer) {
	    //BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	    //String encodedPassword = passwordEncoder.encode(customer.getPassword());
	    //customer.setPassword(encodedPassword);
	     
	    customerRepo.save(customer);
	     
	    return "register_success";
	}
	

	

}
