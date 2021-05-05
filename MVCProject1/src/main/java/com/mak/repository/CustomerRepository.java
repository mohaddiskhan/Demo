package com.mak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mak.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
