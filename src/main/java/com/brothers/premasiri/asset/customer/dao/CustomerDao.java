package com.brothers.premasiri.asset.customer.dao;

import com.brothers.premasiri.asset.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface CustomerDao extends JpaRepository<Customer, Integer> {
    Customer findFirstByOrderByIdDesc();

    Customer findByNic(String nic);

    Customer findByNumber(String number);
}
