package com.ravi.demo.controller;


import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.ravi.demo.entity.Employee;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@GetMapping(value = "/getAll" , consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAllEmployeedetails(){
		
		 return ResponseEntity.ok("all employees");
	}
	
	@GetMapping(value = "/getById/{id}/{name}" , consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAllEmployeedetailsById(@PathVariable String id , @PathVariable String name){
		
		 return ResponseEntity.ok("all employees by ID "+id+ " name "+name);
	}
	
	@GetMapping(value = "/getById" , consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAllEmployeedetailsByIdQueryParam(@RequestParam String id , @RequestParam String name){
		
		 return ResponseEntity.ok("all employees by ID by path param "+id+" name "+name);
	}
	
	@PostMapping(path = "/create" , consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employee> createEmployee(@RequestBody @Valid Employee employee ){
		System.out.println(employee.toString());
		
		 return new ResponseEntity<Employee>(employee, HttpStatus.CREATED) ;
				 }
	
	

}
