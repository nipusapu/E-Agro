package com.susl.agroapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.susl.agroapi.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}
