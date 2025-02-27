package Controller;

import Model.Address;
import Model.Employee;

import java.util.LinkedHashMap;

public class Branch
{
    LinkedHashMap<String, Employee> employees=new LinkedHashMap<>();

    public boolean create_employee(String ifce, String emp_id, String emp_name, String emp_password, String emp_resignation, Address address,String contact)
    {
        employees.put(emp_id,new Employee(ifce, emp_id, emp_name, emp_password, emp_resignation, address, contact));
        return true;
    }

    public LinkedHashMap<String,Employee> view_employees()
    {
        return employees;
    }


}
