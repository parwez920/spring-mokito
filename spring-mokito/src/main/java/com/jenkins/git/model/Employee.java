package com.jenkins.git.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data

public class Employee {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Double salary;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	

}
