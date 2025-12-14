package srms;

public class Student extends Person {

    private String major;
    private double gpa;

    public Student(String name, int id, int age, String major, double gpa)
            throws InvalidStudentDataException {
        super(name, id, age);
        setMajor(major);
        setGpa(gpa);
    }

    public String getMajor() { return major; }
    public double getGpa() { return gpa; }

    public void setMajor(String major) throws InvalidStudentDataException {
        if (major == null || major.trim().isEmpty())
            throw new InvalidStudentDataException("Major cannot be empty");
        this.major = major;
    }

    public void setGpa(double gpa) throws InvalidStudentDataException {
        if (gpa < 0 || gpa > 5)
            throw new InvalidStudentDataException("GPA must be between 0 and 5");
        this.gpa = gpa;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Major: " + major);
        System.out.println("GPA  : " + gpa);
        System.out.println("------------------");
    }
}