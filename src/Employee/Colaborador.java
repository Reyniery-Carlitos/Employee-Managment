package Employee;

import java.util.ArrayList;
import java.util.List;

public class Colaborador extends Employee{
    private List<String> programingLanguages;

    public Colaborador (String id, String name, String lastname, int age, String email){
        super(id, name, lastname, age, email);
        programingLanguages = new ArrayList<String>();
    }

    public void AddNewLanguage(String languaje){
        this.programingLanguages.add(languaje);
    }

    public void PrintMyLanguages(){
        System.out.println(super.getId() + " Knows the next languages: " );

        for (String languajes: this.programingLanguages) {
            System.out.println(languajes);
        }

    }
}
