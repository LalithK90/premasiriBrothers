package com.brothers.premasiri.resourse.supplierResources.service;

import com.brothers.premasiri.common.interfaces.AbstractService;
import com.brothers.premasiri.resourse.supplierResources.entity.SupplierContactPerson;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SupplierContactPersonService implements AbstractService<SupplierContactPerson, Integer> {

    public List<SupplierContactPerson> findAll() {
        return null;
    }


    public SupplierContactPerson findById(Integer id) {
        return null;
    }


    public SupplierContactPerson persist(SupplierContactPerson supplierContactPerson) {
        return null;
    }


    public boolean delete(Integer id) {
        return false;
    }


    public List<SupplierContactPerson> search(SupplierContactPerson supplierContactPerson) {
        return null;
    }
}
