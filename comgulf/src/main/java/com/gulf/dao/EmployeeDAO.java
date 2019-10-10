package com.gulf.dao;

import java.util.List;

import com.gulf.pojo.EmployeeEntity;

public interface EmployeeDAO {
	public List<EmployeeEntity> getAllEmployees();

	public void addEmployee(EmployeeEntity employee);
}
