package com.jpa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.Entity.Role;
import com.jpa.repository.RoleRepository;
import com.jpa.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	RoleRepository roleRepository;
	
	@Override
	public List<Role> findAll() {
		
		return roleRepository.findAll();
	}


}
