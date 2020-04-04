package com.tuanREST.Service;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
import com.tuanREST.DAO.*;
import com.tuanREST.Model.*;
@Path("/employees")
public class EmployeeService {
	 // URI:
    // /contextPath/servletPath/employees
    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<Employee> getEmployees_JSON() {
        List<Employee> listOfCountries = EmployeeDao.getAllEmployees();
        return listOfCountries;
    }
 
    // URI:
    // /contextPath/servletPath/employees/{empId}
    @GET
    @Path("/{empID}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Employee getEmployee(@PathParam("empID") String empID) {
        return EmployeeDao.getEmployee(empID);
    }
 
    // URI:
    // /contextPath/servletPath/employees
    @POST
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Employee addEmployee(Employee emp) {
        return EmployeeDao.addEmployee(emp);
    }
 
    // URI:
    // /contextPath/servletPath/employees
    @PUT
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Employee updateEmployee(Employee emp) {
        return EmployeeDao.updateEmployee(emp);
    }
 
    @DELETE
    @Path("/{empID}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public void deleteEmployee(@PathParam("empID") String empID) {
        EmployeeDao.deleteEmployee(empID);
    }
 
}
