package com.example.onetomany;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.example.onetomany.entity.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
