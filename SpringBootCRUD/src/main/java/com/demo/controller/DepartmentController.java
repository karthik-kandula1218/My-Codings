package com.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Exceptions.DepartmentNotFoundException;
import com.demo.entity.Department;
import com.demo.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentservice;
	
	
	
	
	
	  @PostMapping("/departments") public Department saveDepartment(@RequestBody
	  Department department) {
	  
	  
	  return departmentservice.saveDepartment(department);
	  
	  }
	 
	
	@GetMapping("/departments")
	public List<Department> fetchDepartmentList()
	{
		return departmentservice.fetchDepartmentList();
	
	}
	
	@GetMapping("/departments/{id}")
	public Department fecthDepartmentById(@PathVariable("id") Long dId)throws DepartmentNotFoundException {
		 
		return departmentservice.fecthDepartmentById(dId);
	}
	
	/*
	 * @GetMapping("/departments/name/{name}") public Department
	 * fecthByDepartmentName(@PathVariable("name") String dName) {
	 * 
	 * return departmentservice.fecthByDepartmentName(dName); }
	 */
	
	
	
	@DeleteMapping("/departments/{id}")
	public String deleteById(@PathVariable("id") Long dId) {
		
		departmentservice.deleteById(dId);
		return "Deleted successfully"+dId;
	}
	
	@PutMapping("/departments/{id}")
	public Department updateDepartment( @PathVariable("id") Long dId,@RequestBody Department department) {
		
		return departmentservice.updateDepartment(dId, department);
		
		
	}
	
}