package Employee;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {
    private String id;
    private String name;
    private String lastname;
    private int age;
    private String email;

    // Constructor Employee
    public Employee(String id, String name, String lastname, int age, String email){
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.setAge(age);
        this.setEmail(email);
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

    // Presentacion
    public String Presentation(){
        return this.id + " " + this.name + " " + this.lastname;
    }

    // Metodo setEmail con validador de correo.
    public void setEmail(String email){
        // Validacion del correo con expresiones regulares
        this.email = email;
        Pattern validar = Pattern.compile("^[A-Za-z0-9-_]+(\\.[A-Za-z0-9-_]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = validar.matcher(email);
        if (matcher.find()){
            System.out.println(name + ", el correo " + email + " ES VALIDO \n ---------------------");
        } else {
            System.out.println(name + ", el correo " + email + " NO ES VALIDO. \t por favor ingrese un correo valido \n ---------------------");
        }
    }

    // Metodo getEmail
    public String getEmail(){
        return email;
    }
}
