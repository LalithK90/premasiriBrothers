package com.brothers.premasiri.asset.employee.dao;

import com.brothers.premasiri.asset.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long> {
    Employee findFirstByOrderByIdDesc();

}
