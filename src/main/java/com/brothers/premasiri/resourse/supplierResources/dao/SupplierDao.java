package com.brothers.premasiri.resourse.supplierResources.dao;

import com.brothers.premasiri.resourse.supplierResources.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierDao extends JpaRepository<Supplier, Integer> {
}
