package com.brothers.premasiri.asset.customer.service;


import com.brothers.premasiri.asset.customer.dao.CustomerDao;
import com.brothers.premasiri.asset.customer.entity.Customer;
import com.brothers.premasiri.util.interfaces.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerService implements AbstractService<Customer, Integer> {
    private final CustomerDao customerDao;

    @Autowired
    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }


    public List<Customer> findAll() {
        return customerDao.findAll();
    }


    public Customer findById(Integer id) {
        return customerDao.getOne(id);
    }


    public Customer persist(Customer patient) {
        return customerDao.save(patient);
    }


    public boolean delete(Integer id) {
        customerDao.deleteById(id);
        return false;
    }


    public List<Customer> search(Customer patient) {
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        Example<Customer> patientExample = Example.of(patient, matcher);
        return customerDao.findAll(patientExample);
    }


    public Customer lastPatient(){
        return customerDao.findFirstByOrderByIdDesc();
    }


    public Customer findByNIC(String nic) {
        return customerDao.findByNic(nic);
    }

    public Customer findByNumber(String number) {
        return customerDao.findByNumber(number);
    }
}
