package com.brothers.premasiri.asset.supplier.dao;

import com.brothers.premasiri.asset.supplier.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierDao extends JpaRepository<Supplier, Integer> {
}
