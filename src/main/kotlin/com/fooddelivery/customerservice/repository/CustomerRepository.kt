package com.fooddelivery.customerservice.repository

import com.fooddelivery.customerservice.entity.Customers
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.query.Param

interface CustomerRepository: JpaRepository<Customers, Long> {
     fun findCustomersById(@Param("id") id:Long) : Customers?
}