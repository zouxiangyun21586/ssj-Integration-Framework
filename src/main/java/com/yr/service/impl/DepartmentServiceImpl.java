package com.yr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yr.entity.Department;
import com.yr.jpa.impl.Department_jpa_Impl;
import com.yr.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private Department_jpa_Impl department_jpa_impl; 
	
	@Override
	public List<Department> query() {
		List<Department> listDepartment = department_jpa_impl.query();
		return listDepartment;
	}

	@Transactional
	@Override
	public void insert(Department department) throws Exception{
		department_jpa_impl.insert(department);
		int i = 1/0;
		department_jpa_impl.insert(department);
	}

}
