package srms;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        SRMS system = new SRMS();
        ReportGenerator report = new ReportGenerator();

        boolean run = true;

        while (run) {

            System.out.println("""
            1- Add Student
            2- Remove Student
            3- Update Student
            4- Show All
            5- GPA Report
            6- Major Report
            7- Save
            8- Exit
            """);

            System.out.print("Choice: ");
            int choice = in.nextInt();

            switch (choice) {

                case 1 -> {
                    in.nextLine();
                    System.out.print("Name: ");
                    String name = in.nextLine();

                    System.out.print("ID: ");
                    int id = in.nextInt();

                    System.out.print("Age: ");
                    int age = in.nextInt();

                    in.nextLine();
                    System.out.print("Major: ");
                    String major = in.nextLine();

                    System.out.print("GPA: ");
                    double gpa = in.nextDouble();

                    system.addStudent(new Student(name, id, age, major, gpa));
                }

                case 2 -> {
                    System.out.print("ID: ");
                    int id = in.nextInt();
                    system.removeStudent(id);
                }

                case 3 -> {
                    System.out.print("ID: ");
                    int id = in.nextInt();

                    in.nextLine();
                    System.out.print("Name: ");
                    String name = in.nextLine();

                    System.out.print("Age: ");
                    int age = in.nextInt();

                    in.nextLine();
                    System.out.print("Major: ");
                    String major = in.nextLine();

                    System.out.print("GPA: ");
                    double gpa = in.nextDouble();

                    system.updateStudent(id, name, age, major, gpa);
                }

                case 4 -> {
                    for (Student s : system.getStudents()) {
                        s.display();
                    }
                }

                case 5 -> {
                    System.out.print("Min GPA: ");
                    double min = in.nextDouble();
                    report.reportByGpa(system.getStudents(), min);
                }

                case 6 -> {
                    in.nextLine();
                    System.out.print("Major: ");
                    String major = in.nextLine();
                    report.reportByMajor(system.getStudents(), major);
                }

                case 7 -> {
                    system.save();
                    System.out.println("Save successful");
                }

                case 8 -> {
                    system.stopAutoSave();
                    system.save();
                    System.out.println("stop saving");
                    run = false;
                }

                default -> System.out.println("Invalid choice");
            }
        }
    }
}