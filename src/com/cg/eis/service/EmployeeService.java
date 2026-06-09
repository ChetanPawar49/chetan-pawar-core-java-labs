package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	void addEmployee(Employee employee);

    void displayEmployeesByScheme(String scheme);

    void deleteEmployee(int empId);

    String getInsuranceScheme(double salary, String designation);
}
