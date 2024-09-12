package com.fooddelivery.customerservice.controller

import com.fooddelivery.customerservice.dto.ResponseDto
import com.fooddelivery.customerservice.entity.Customers
import com.fooddelivery.customerservice.service.CustomerService
import jakarta.validation.Valid
import lombok.RequiredArgsConstructor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
class CustomerController {
    @Autowired
    private lateinit var customerService: CustomerService
    @PostMapping
    fun createCustomer(@Valid @RequestBody reqBody : Customers) : ResponseEntity<Customers> {
        return  ResponseEntity.ok().body(customerService.createCustomer(reqBody))
    }

    @GetMapping("/{id}")
    fun getCustomerById(@PathVariable("id") id: String) : ResponseEntity<Customers> {
        return ResponseEntity.ok().body(customerService.getCustomerById(id))
    }

    @GetMapping()
    fun getUser() :ResponseEntity<String>{
        return  ResponseEntity.ok().body("Hello")
    }
}