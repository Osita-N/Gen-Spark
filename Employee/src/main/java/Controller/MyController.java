package Controller;

import Entity.Employee;
import Service.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {


    @Autowired
    private EmployeeServices employeeServices;

    @GetMapping("/")
    public String main() { return "<HTML><H1>Welcome to home page</H1></HTML>"; }

    @GetMapping("/employees")
    public List<Employee> getEmployee(){ return this.employeeServices.getEmployees();}

    @GetMapping("/employee/{employeeID}")
    public Employee getEmployee(@PathVariable String employeeID)
    {
        return this.employeeServices.getEmployee(Long.parseLong(employeeID));
    }

    @PostMapping("/courses")
    public Employee addEmployee(@RequestBody Employee employee)
    {
        return this.employeeServices.addEmployee(employee);
    }


    @PutMapping("/courses")
    public Employee updateEmployee(@RequestBody Employee employee)
    {
        return this.employeeServices.updateEmployee(employee);
    }

    @DeleteMapping("/courses/{courseID}")
    public String deleteEmployee(@PathVariable String employeeID)
    {
        return this.employeeServices.deleteEmployee(Long.parseLong(employeeID));
    }




}
