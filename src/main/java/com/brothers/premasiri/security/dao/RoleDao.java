package com.brothers.premasiri.security.dao;


import com.brothers.premasiri.security.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface RoleDao extends JpaRepository< Role, Long> {
}
