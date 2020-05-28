package com.jenkins.git.controlller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jenkins.git.model.Employee;
import com.jenkins.git.reponse.Response;
import com.jenkins.git.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeRepository repository;

	@PostMapping("/addEmployee")
	public Response addEmployee(@RequestBody Employee employee) {
		repository.save(employee);
		return new Response(employee.getId() + " inserted", Boolean.TRUE);
	}
	@GetMapping("/getEmployee")
	public Response getEmployee() {
		List<Employee> employee = repository.findAll();
		return new Response("record count" + employee.size(), Boolean.TRUE);
	}

}
