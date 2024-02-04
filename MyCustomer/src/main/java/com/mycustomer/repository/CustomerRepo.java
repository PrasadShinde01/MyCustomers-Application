package com.mycustomer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycustomer.model.*;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long>{

}
