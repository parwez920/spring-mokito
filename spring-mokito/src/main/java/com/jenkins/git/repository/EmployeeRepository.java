package com.jenkins.git.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jenkins.git.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
