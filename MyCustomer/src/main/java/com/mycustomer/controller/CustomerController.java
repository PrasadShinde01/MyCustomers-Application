package com.mycustomer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.mycustomer.model.*;
import com.mycustomer.service.CustomerService;

@Controller
public class CustomerController {
     @Autowired
     private CustomerService CustomerService;
     
     @GetMapping("/")
     public String viewHomePage(Model model) {
    	 model.addAttribute("listCustomer", CustomerService.getAllCustomer());
    	 return "index";
     }
     @GetMapping("/showNewCustomerForm")
     public String showNewCustomerForm(Model model) {
    	 Customer customer=new Customer();
    	 model.addAttribute("customer",customer);
    	 return "new_customer";
     }
     @PostMapping("/saveCustomer")
     public String saveCustomer(@ModelAttribute("customer") Customer customer) {
    	 CustomerService.saveCustomer(customer);
    	 return "redirect:/";
     }
     @GetMapping("/showFormForUpdate/{id}")
     public String showFormForUpdate(@PathVariable(value="id")long id, Model model) {
     
    	 Customer customer=CustomerService.getCustomerById(id);
     
     model.addAttribute("customer",customer);
     return "update_customer";
}
     @GetMapping("/deleteCustomer/{id}")
     public String deleteCustomer(@PathVariable(value="id")long id) {
    	 this.CustomerService.deleteCustomerById(id);
    	 return "redirect:/";
     }
}
