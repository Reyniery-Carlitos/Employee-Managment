package Aplication;

import Employee.Employee;
import Employee.Colaborador;
import Employee.Supervisor;

public class App {
    public static void main(String[] args){
        Supervisor e1 = new Supervisor("1000", "Carlos", "Rubio", 1000, "Carlos@gmail.com");
        Colaborador c1 = new Colaborador("1111", "Felix", "Rodriguez", 33, "fex.com");
        // Creacion de nuevo empleado por motivo de prueba.
        Employee emp1 = new Employee("2222", "Ruben", "Gonzales", 25, "Ruben123@gmail.com");

        c1.AddNewLanguage("PHP");
        c1.AddNewLanguage("NODE");
        c1.AddNewLanguage("SCALA");
        c1.AddNewLanguage("R");

        c1.PrintMyLanguages();

        e1.AssignNewEmployee(c1);
        e1.PrintEmployees();
    }
}
