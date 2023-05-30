package com.example.MyPay3.controllers;

import com.example.MyPay3.models.Customer;
import com.example.MyPay3.repository.CustomerRepo;
import com.example.MyPay3.service.CustomerService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.parameters.P;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

/*
    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/customers")
    public Customer addCustomer(@RequestBody Customer customer){

        customer.setPassword(passwordEncoder.encode(customer.getPassword()));
        return customerService.registerCustomer(customer);

    }

    @PutMapping("/customer/add/{money}")
    public Customer addMoneyToCustomerWallet(@AuthenticationPrincipal(expression = "username") String email, @PathVariable("money") Double money){

        return customerService.addMoneyToCustomerWallet(email,money);
    }

    @PutMapping("/customer/withdraw/{money}")
    public Customer withDrawMoneyFromCustomerHandler(@AuthenticationPrincipal(expression = "username") String email, @PathVariable("money") Double money){
        return customerService.withdrawMoneyFromCustomerWallet(email,money);
    }

    @PutMapping("/customer/addmoney/{otherUserEmail}/{money}")
    public String addMoneyToOtherUserWalletHandler(@AuthenticationPrincipal(expression = "username") String email, @PathVariable("otherUserEmail") String otherUserEmail, @PathVariable("money") Double money) throws IllegalArgumentException{

        return customerService.addMoneyToOtherUserWallet(email, otherUserEmail, money);

    }

    @GetMapping("/customer")
    public Customer getCustomer(@AuthenticationPrincipal(expression = "username") String email){
        return customerRepo.findByEmail(email);
    }


*/



}
