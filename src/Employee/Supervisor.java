package Employee;

import java.util.ArrayList;
import java.util.List;

public class Supervisor extends Employee{
    private List<Employee> employees;

    public Supervisor (String id, String name, String lastname, int age){
        super(id, name, lastname, age);
        this.employees = new ArrayList<Employee>();
    }

    public void AssignNewEmployee(Employee e){
        this.employees.add(e);
    }

    public void PrintEmployees(){
        System.out.println("This supervisor (" + super.getName() + ") has employees: ");

        for (Employee e: this.employees) {
            System.out.println(e.Presentation());
        }
    }
}
