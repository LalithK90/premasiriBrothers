package com.brothers.premasiri.resourse.supplierResources.service;


import com.brothers.premasiri.resourse.supplierResources.entity.Supplier;
import com.brothers.premasiri.util.interfaces.AbstractService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class SupplierService implements AbstractService<Supplier, Integer > {



    public List<Supplier> findAll() {
        return null;
    }


    public Supplier findById(Integer id) {
        return null;
    }


    public Supplier persist(Supplier supplier) {
        return null;
    }


    public boolean delete(Integer id) {
        return false;
    }


    public List<Supplier> search(Supplier supplier) {
        return null;
    }
}