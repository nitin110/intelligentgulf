package com.gulf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.gulf.pojo.EmployeeEntity;
import com.gulf.service.EmployeeManager;

@Controller
@RequestMapping("/employee-module")
@SessionAttributes("employee")
public class EmployeeController {

	@Autowired
	EmployeeManager manager;

	@ModelAttribute("allEmployees")
	public List<EmployeeEntity> populateEmployees() {
		List<EmployeeEntity> employees = manager.getAllEmployees();
		return employees;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(Model model) {
		EmployeeEntity employeeVO = new EmployeeEntity();
		model.addAttribute("employee", employeeVO);
		return "listEmployeeView";
	}
}
