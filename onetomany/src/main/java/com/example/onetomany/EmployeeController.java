package com.example.onetomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.onetomany.entity.Employee;
import com.example.onetomany.entity.MobileNumber;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository empRepo;
	


	@PostMapping
	public Employee save(@RequestBody Employee employee) {
		for(MobileNumber mobNum : employee.getMobileNumberList()) {
			mobNum.setEmployee(employee);
		}
		return empRepo.save(employee);
	}
	
	

}
