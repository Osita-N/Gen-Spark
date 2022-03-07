package Service;

import Entity.Employee;

import java.util.List;

public interface EmployeeServices {

   List<Employee> getEmployees();
   Employee getEmployee(long employeeID);
   Employee addEmployee(Employee employee);
   Employee updateEmployee(Employee employee);
   String deleteEmployee(long employeeID);

}
