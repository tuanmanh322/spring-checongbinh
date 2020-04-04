package com.tuanREST.DAO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tuanREST.Model.Employee;

public class EmployeeDao {
	 private static final Map<String, Employee> empMap = new HashMap<String, Employee>();
	 
	    static {
	        initEmps();
	    }
	    private static void initEmps() {
	        Employee emp1 = new Employee("ID01", "JohnCena", "The United States of America");
	        Employee emp2 = new Employee("ID02", "RandyOrton", "The United States of America");
	        Employee emp3 = new Employee("ID03", "Rock", "The United States of America");
	 
	        empMap.put(emp1.getEmpID(), emp1);
	        empMap.put(emp2.getEmpID(), emp2);
	        empMap.put(emp3.getEmpID(), emp3);
	    }
	    public static Employee getEmployee(String empID) {
	        return empMap.get(empID);
	    }
	 
	    public static Employee addEmployee(Employee emp) {
	        empMap.put(emp.getEmpID(), emp);
	        return emp;
	    }
	    public static Employee updateEmployee(Employee emp) {
	        empMap.put(emp.getEmpID(), emp);
	        return emp;
	    }
	    public static void deleteEmployee(String empID) {
	        empMap.remove(empID);
	    }
	    public static List<Employee> getAllEmployees() {
	        Collection<Employee> T = empMap.values();
	        List<Employee> list = new ArrayList<Employee>();
	        list.addAll(T);
	        return list;
	    } 
	    List<Employee> list;
	 
}
