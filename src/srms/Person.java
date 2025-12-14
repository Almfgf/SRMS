package srms;

import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private int id;
    private int age;

    public Person(String name, int id, int age) throws InvalidStudentDataException {
        setName(name);
        setId(id);
        setAge(age);
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public int getAge() { return age; }

    public void setName(String name) throws InvalidStudentDataException {
        if (name == null || name.trim().isEmpty())
            throw new InvalidStudentDataException("Name cannot be empty");
        this.name = name;
    }

    public void setId(int id) throws InvalidStudentDataException {
        if (id <= 0)
            throw new InvalidStudentDataException("ID must be positive");
        this.id = id;
    }

    public void setAge(int age) throws InvalidStudentDataException {
        if (age < 0)
            throw new InvalidStudentDataException("Age cannot be negative");
        this.age = age;
    }

    public void display() {
        System.out.println("Student info");
        System.out.println("Name : " + name);
        System.out.println("ID   : " + id);
        System.out.println("Age  : " + age);
    }
}