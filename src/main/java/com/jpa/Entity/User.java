package com.jpa.Entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "User")
public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8475824885254604824L;

	@Id
	@Column(name = "fullName")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fullName;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "gender")
	private String gender;
	
	@ManyToOne
	@JoinColumn(name = "ROLEID", referencedColumnName = "roleId")
	@JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
	private Role roleId;
	

	
	public int getFullName() {
		return fullName;
	}


	public void setFullName(int fullName) {
		this.fullName = fullName;
	}


	public User(int fullName, int age, String gender, Role roleId) {
		super();
		this.fullName = fullName;
		this.age = age;
		this.gender = gender;
		this.roleId = roleId;
	}


	public User() {
		
	}
	

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public Role getRoleId() {
		return roleId;
	}

	public void setRoleId(Role roleId) {
		this.roleId = roleId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
