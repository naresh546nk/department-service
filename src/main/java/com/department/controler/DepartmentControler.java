package com.department.controler;


import java.util.Map;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.department.entity.Department;
import com.department.service.DepartmentService;


import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentControler {
	@Autowired
	private DepartmentService departmentService;

	Logger logger =org.slf4j.LoggerFactory.getLogger(DepartmentControler.class);
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {

		logger.info("save department method called.");
		System.out.println(department);
		return departmentService.save(department);
	}
	
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable("id") Long departmentId) {
		logger.info("fid department by id method called..");
		 Department findDepartmentById = departmentService.findDepartmentById(departmentId);
		 System.out.println(findDepartmentById);
		 return findDepartmentById;
		
	}
}
