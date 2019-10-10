package com.gulf.dao;

import java.util.List;

import com.gulf.pojo.EmployeeEntity;

public class EmployeeDAOImpl implements EmployeeDAO {
	@PersistenceContext
	private EntityManager manager;

	public List<EmployeeEntity> getAllEmployees() {
		List<EmployeeEntity> employees = manager.createQuery("Select a From EmployeeEntity a", EmployeeEntity.class)
				.getResultList();
		return employees;
	}
}
