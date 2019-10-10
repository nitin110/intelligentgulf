package com.gulf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gulf.dao.EmployeeDAO;
import com.gulf.pojo.EmployeeEntity;

public class EmployeeManagerImpl implements EmployeeManager {
	@Autowired
	EmployeeDAO dao;

	public List<EmployeeEntity> getAllEmployees() {
		return dao.getAllEmployees();
	}

	public void addEmployee(EmployeeEntity employee) {
		dao.addEmployee(employee);
	}
}
