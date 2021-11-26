package com.demo.service;


import java.util.List;

import org.springframework.http.ResponseEntity;

import com.demo.Exceptions.DepartmentNotFoundException;
import com.demo.entity.Department;


public interface DepartmentService {

 public Department saveDepartment(Department department);
  
 public List<Department> fetchDepartmentList();

 public Department fecthDepartmentById(Long dId) throws DepartmentNotFoundException;

public void deleteById(Long dId);


public Department updateDepartment(Long dId, Department department);

/* Department fecthByDepartmentName(String dName) */;
}
