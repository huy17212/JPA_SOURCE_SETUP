package com.jpa.service;

import java.util.List;

import com.jpa.Entity.Role;

public interface RoleService {
	
	List<Role> findAll();
	
	Role getRoleById(Integer id);
}
