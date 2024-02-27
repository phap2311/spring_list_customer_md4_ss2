package com.example.spring_customer;

import com.example.spring_customer.models.Customer;
import com.example.spring_customer.service.CustomerService;
import com.example.spring_customer.service.ICustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    ICustomerService iCustomerService = new CustomerService();

    //c1
//    @GetMapping("")
//    public String showList(HttpServletRequest request) {
//        List<Customer> customerList = iCustomerService.findAll();
//        request.setAttribute("customer", customerList);
//        return "/list";
//
//    }
//    @GetMapping(value = "/create")
//    public String showFormCreate(HttpServletRequest request) {
//        List<Customer> customerList = iCustomerService.findAll();
//        request.setAttribute("customer", customerList);
//        return "/list";
//
//    }
    //c2
//    @GetMapping("/customer")
//    public String showList(Model model){
//        List<Customer>customerList = iCustomerService.findAll();
//        model.addAttribute("customer",customerList);
//        return "/list";
//    }
    @GetMapping("")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("/list");
        List<Customer> customerList = iCustomerService.findAll();
        modelAndView.addObject("customer", customerList);
        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView showInformation(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("infor");
        Customer customer = iCustomerService.findById(id);
        modelAndView.addObject("customer", customer);
        return modelAndView;

        
    }

    @PostMapping
    public String updateCustomer(Customer customer) {
        iCustomerService.save(customer);
        return "redirect:/customer";
    }
//        @GetMapping("/customer")
//    public String showDetailList(HttpServletRequest request) {
//        int id = Integer.parseInt(request.getParameter("id"));
//        Customer customer = iCustomerService.findById(id);
//        request.setAttribute("customer", customer);
//        return "/view";
//
//    }

}
