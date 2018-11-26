package com.yr.jpa.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.yr.entity.Department;
import com.yr.jpa.Department_jpa;

@Repository
public class Department_jpa_Impl implements Department_jpa {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Department> query() {
		//查询总数
		Query q = entityManager.createQuery("FROM Department");
		List<Department> listD = q.getResultList();
		return listD;
	}

	@Override
	public void insert(Department department) {
		entityManager.persist(department);
	}

	
	

}
