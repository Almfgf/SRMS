package srms;

import java.util.ArrayList;

public class ReportGenerator {

    public void reportByGpa(ArrayList<Student> students, double minGpa) {
        System.out.println("GPA Report = ");

        boolean found = false;
        for (Student s : students) {
            if (s.getGpa() >= minGpa) {
                s.display();
                found = true;
            }
        }

        if (!found) System.out.println("No students match this GPA");
    }

    public void reportByMajor(ArrayList<Student> students, String major) {
        System.out.println("Major Report = ");

        boolean found = false;
        for (Student s : students) {
            if (s.getMajor().equalsIgnoreCase(major)) {
                s.display();
                found = true;
            }
        }

        if (!found) System.out.println("No students match this major");
    }
}