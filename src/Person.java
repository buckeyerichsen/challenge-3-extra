import java.util.ArrayList;

public class Person {
    private String name;
    private String email;


    public Person() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displaytext(){
        System.out.println(getName());
        System.out.println(getEmail());
    }

    }

