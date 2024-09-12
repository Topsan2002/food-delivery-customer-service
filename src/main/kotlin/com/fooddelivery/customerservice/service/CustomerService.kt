package com.fooddelivery.customerservice.service

import com.fooddelivery.customerservice.entity.Customers
import com.fooddelivery.customerservice.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerService {
    @Autowired
    lateinit var customerRepository: CustomerRepository

    fun createCustomer(data : Customers) : Customers?{
        try {
            customerRepository.save(data);
            return  data
        }catch (e: Exception){
            e.printStackTrace()
        }
        return null
    }

    fun getCustomerById(id : String) : Customers? {
        return customerRepository.findCustomersById(id.toLong())
    }


}