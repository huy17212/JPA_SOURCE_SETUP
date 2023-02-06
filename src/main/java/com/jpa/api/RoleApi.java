package com.jpa.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.Entity.Role;
import com.jpa.service.RoleService;

@RestController
@RequestMapping("/api/role")
public class RoleApi {
	@Autowired
	RoleService roleService;
	
	// http method: GET, POST, PUT, DELETE
	
	// localhost:8081/api/role/all
	@GetMapping("/all")
	public ResponseEntity<?> doGetAll(){
		List<Role> roles = roleService.findAll();
		// http status code: 200, 201, 202, 400, 401, 403, 404, 500
		return ResponseEntity.ok(roles);
				
	}
	
	@GetMapping("/id={id}")
	public ResponseEntity<?> getById(@RequestParam("id") Integer id){
		Role role = roleService.getRoleById(id);
		// http status code: 200, 201, 202, 400, 401, 403, 404, 500
		return ResponseEntity.ok(role);
				
	}
	
}