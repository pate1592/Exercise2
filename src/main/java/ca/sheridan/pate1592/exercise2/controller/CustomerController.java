package ca.sheridan.pate1592.exercise2.controller;

import ca.sheridan.pate1592.exercise2.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService=customerService;
    }

    @GetMapping(value = {"/","/CustomerList"})
    public ModelAndView customerList(){
        return new ModelAndView("CustomerList","customer",customerService.getCustomer());
    }
}
