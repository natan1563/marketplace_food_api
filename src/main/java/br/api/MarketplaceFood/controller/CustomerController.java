package br.api.MarketplaceFood.controller;

import br.api.MarketplaceFood.dto.CustomerDTO;
import br.api.MarketplaceFood.entity.Customer;
import br.api.MarketplaceFood.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody @Valid CustomerDTO customerDTO) {
        Customer savedCustomer = customerService.create(customerDTO);
        return ResponseEntity.ok(savedCustomer);
    }
}
