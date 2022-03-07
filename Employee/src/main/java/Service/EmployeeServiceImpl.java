package Service;

import Entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeServices {
    List<Employee> list;
    long employeeID;

    public EmployeeServiceImpl(List<Employee> list) {
        list = new ArrayList<>(){{
            add(new Employee(101, "Osita"));
            add(new Employee(102, "Nduka"));
            add(new Employee(103, "Nudka"));
        }};
    }

    @Override
    public List<Employee> getEmployees() { return list; }

    @Override
    public Employee getEmployee(long employeeID) {
        this.employeeID = employeeID;
        Employee e = null;
        for (Employee employee:
             list) {
            if (employee.getId()==employeeID){
                e = employee;
                break;
            }
        }
        return e;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        list.add(employee);
        return employee;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        String name = employee.getName();
        Employee e = null;
        for (Employee em : list) {
            if (em.getId() == employee.getId()){
                em.setName(name);
                e = em;
                break;
            }
        }
        return e;
    }

    @Override
    public String deleteEmployee(long employeeID) {
        this.employeeID = employeeID;
        for (Employee employee : list)
        {
            if(employee.getId() == employeeID)
            {
                list.remove(employee);
                break;
            }
        }
        return "Deleted";
    }
}
