package com.demo.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.demo.Exceptions.DepartmentNotFoundException;
import com.demo.dao.DepartmentDao;
import com.demo.entity.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentDao departmentDao;
	
	//create Data using POST
	@Override
	public Department saveDepartment(Department customer) {
		
		return 	departmentDao.save(customer);
	
		
		
	}

	
	
	
	//GET all table data 
	
	@Override
	public List<Department> fetchDepartmentList() {
		
		return departmentDao.findAll();
	}
	
	//GET by ID 
	@Override
	public Department fecthDepartmentById(Long dId) throws DepartmentNotFoundException {
		// TODO Auto-generated method stub
		Optional<Department>  department=departmentDao.findById(dId);
		if(!department.isPresent()) {
			throw new DepartmentNotFoundException("Department not Available");
		}
		
		return department.get();
		}
	

	
	//Delete for removing dept details with ID 
	@Override
	public void deleteById(Long dId) {
		
		departmentDao.deleteById(dId);
	}

	//PUT Service impl for updating or modifying data
	@Override
	public Department updateDepartment(Long dId, Department department) {
		
		Department depDB = departmentDao.findById(dId).get();
		
		//null check and empty data checks for fields
		if(Objects.nonNull(department.getdName()) && !"".equalsIgnoreCase(department.getdName())) {
			depDB.setdName(department.getdName());
			}
		
		if(Objects.nonNull(department.getdAddress()) && !"".equalsIgnoreCase(department.getdAddress())) {
			depDB.setdAddress(department.getdAddress());	
			}
		
		if(Objects.nonNull(department.getdCode()) && !"".equalsIgnoreCase(department.getdCode())) {
			depDB.setdCode(department.getdCode());
			}
		
		return departmentDao.save(depDB);
	}

	/*
	 * @Override
	 *  public Department fecthByDepartmentName(String depName) { // TODO
	 * 
	 * Auto-generated method stub return departmentDao.findByDName(depName); }
	 */

	

	
	
	
}
