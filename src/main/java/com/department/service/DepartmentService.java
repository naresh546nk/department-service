package com.department.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.entity.Department;
import com.department.repo.DepartmentRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	@Autowired
	private DepartmentRepo departmentRepo;

	public Department save(Department department) {
		// TODO Auto-generated method stub
	
		return departmentRepo.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		return departmentRepo.findById(departmentId).get();
	}

}
