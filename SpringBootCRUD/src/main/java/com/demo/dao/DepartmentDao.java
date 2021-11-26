package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Department;

@Repository
public interface DepartmentDao extends JpaRepository<Department, Long> {

	/* public Department findByDName(String depName); */
}