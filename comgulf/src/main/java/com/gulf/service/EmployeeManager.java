package com.gulf.service;

import java.util.List;

import com.gulf.pojo.EmployeeEntity;

public interface EmployeeManager {
	public List<EmployeeEntity> getAllEmployees();

	public void addEmployee(EmployeeEntity employee);
}
