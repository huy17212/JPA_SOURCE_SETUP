package com.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.Entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
