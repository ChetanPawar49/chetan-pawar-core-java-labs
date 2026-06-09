package com.cg.eis.pl;

import java.util.*;
import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	
	HashMap<Integer, Employee> employeeMap = new HashMap<>();

	@Override
	public void addEmployee(Employee employee) {
		employeeMap.put(employee.getId(), employee);
	}

	@Override
	public void displayEmployeesByScheme(String scheme) {
		boolean found = false;
		
		for(Map.Entry<Integer, Employee> entry: employeeMap.entrySet()) {
			Employee emp = entry.getValue();
			
			if(emp.getInsuranceScheme().equalsIgnoreCase(scheme)) {
				System.out.println(emp);
				found = true;
			}
		}
		
		if(!found) {
			System.out.println("No employee found under this scheme.");
		}
	}

	@Override
	public void deleteEmployee(int empId) {
		Employee emp = employeeMap.remove(empId);
		
		if(emp != null) {
			System.out.println("Employee deleted successfully");
		} else {
			System.out.println("Employee not found");
		}
	}

	@Override
	public String getInsuranceScheme(double salary, String designation) {
		if(salary > 5000 && salary < 20000 && designation.equalsIgnoreCase("System Associate")) {
			return "Scheme C";
		} else if(salary >= 20000 && salary < 40000 && designation.equalsIgnoreCase("Programmer")) {
			return "Scheme B";
		} else if(salary >= 40000 && designation.equalsIgnoreCase("Manager")) {
			return "Scheme A";
		} else if(salary < 5000 && designation.equalsIgnoreCase("Clerk")) {
			return "No Scheme";
		}
		
		return "No Scheme";
	}
	
}
