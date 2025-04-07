package template;

import template.model.Employee;

import java.util.HashSet;
import java.util.Set;

public class EmployeeManager {

    private Set<Employee> employees;

    public EmployeeManager() {
        this.employees = new HashSet<>();
    }

}
