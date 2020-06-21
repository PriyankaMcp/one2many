package com.example.onetomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.onetomany.entity.EMail;
import com.example.onetomany.entity.Employee;
import com.example.onetomany.entity.MobileNumber;


@RestController

public class EmailController {
	
	@Autowired
	private EmailRepository emilRepo;
	
	
}
