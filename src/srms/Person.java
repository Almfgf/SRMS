package srms;

import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private int id;
    private int age;

    public Person(String name, int id, int age) {
    setName(name);   
    setId(id);      
    setAge(age);
    }
   
    public String getName() { return name; }
    public int getId() { return id; }
    public int getAge() { return age; }

    public void setName(String name) {
        try {
            if (name == null || name.isEmpty())
                throw new Exception("Name cannot be empty");
            this.name = name;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void setId(int id) {
        try {
            if (id <= 0)
                throw new Exception("ID must be positive");
            this.id = id;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void setAge(int age) {
        try {
            if (age < 0)
                throw new Exception("Age cannot be negative");
            this.age = age;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void display() {
        System.out.println("Student info");
        System.out.println("Name : " + name);
        System.out.println("ID   : " + id);
        System.out.println("Age  : " + age);
    }
}