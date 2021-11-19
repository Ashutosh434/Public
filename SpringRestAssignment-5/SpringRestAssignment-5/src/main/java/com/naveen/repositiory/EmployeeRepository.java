package com.naveen.repositiory;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.naveen.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee,Integer> {

	
}
