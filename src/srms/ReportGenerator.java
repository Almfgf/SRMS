package srms;

import java.util.ArrayList;

public class ReportGenerator {

    public void reportByGpa(ArrayList<Student> students, double minGpa) {
        System.out.println("GPA Report = ");

        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getGpa() >= minGpa) {
                s.display();
            }
        }
    }

    public void reportByMajor(ArrayList<Student> students, String major) {
        System.out.println("Major Report = ");

        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getMajor().equalsIgnoreCase(major)) {
                s.display();
            }
        }
    }
}