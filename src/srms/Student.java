package srms;

public class Student extends Person {

    private String major;
    private double gpa;

    public Student(String name, int id, int age, String major, double gpa) {
        super(name, id, age);
        this.major = major;
        this.gpa = gpa;
    }

    public String getMajor() { return major; }
    public double getGpa() { return gpa; }

    public void setMajor(String major) {
        try {
            if (major == null || major.isEmpty())
                throw new Exception("Major cannot be empty");
            this.major = major;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void setGpa(double gpa) {
        try {
            if (gpa < 0 || gpa > 5)
                throw new Exception("GPA must be between 0 and 5");
            this.gpa = gpa;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Major: " + major);
        System.out.println("GPA  : " + gpa);
        System.out.println("------------------");
    }
}