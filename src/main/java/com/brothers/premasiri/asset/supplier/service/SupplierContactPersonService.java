package com.brothers.premasiri.asset.supplier.service;


import com.brothers.premasiri.asset.supplier.entity.SupplierContactPerson;
import com.brothers.premasiri.util.interfaces.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SupplierContactPersonService implements AbstractService<SupplierContactPerson, Long> {

    public List<SupplierContactPerson> findAll() {
        return null;
    }


    public SupplierContactPerson findById(Long id) {
        return null;
    }


    public SupplierContactPerson persist(SupplierContactPerson supplierContactPerson) {
        return null;
    }


    public boolean delete(Long id) {
        return false;
    }


    public List<SupplierContactPerson> search(SupplierContactPerson supplierContactPerson) {
        return null;
    }
}
