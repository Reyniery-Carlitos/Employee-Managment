package Employee;

public class Employee {
    private String id;
    private String name;
    private String lastname;
    private int age;

    // Constructor Employee
    public Employee(String id, String name, String lastname, int age){
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.setAge(age);
    }

    // Metodo setId
    public void setId(String id){
        this.id = id;
    }

    // Metodo getId
    public String getId(){
        return id;
    }

    // Metodo setName
    public void setName(String name){
        this.name = name;
    }

    // Metodo getName
    public String getName(){
        return name;
    }

    // Metodo setLastname
    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    // Metodo getLastname
    public String getLastname(){
        return lastname;
    }

    // Metodo setAge
    public void setAge(int age){
        if (age <= 1 || age >= 100){
            age = 1;
            System.out.println("WARNING: El valor establecido no se encuentra dentro de los rangos establecidos [1,99], POR LO TANTO VALOR FUE SET CON 1");
        }
        this.age = age;
    }

    // Metodo getAge
    public int getAge(){
        return age;
    }

    public String Presentation(){
        return this.id + " " + this.name + " " + this.lastname;
    }
}
