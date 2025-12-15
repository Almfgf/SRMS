package srms;

import java.util.ArrayList;

public class SRMS {

    private final ArrayList<Student> students;
    private final FileHandler fileHandler;
    private final AutoSaver autoSaver;

    public SRMS() {
        fileHandler = new FileHandler("students.ser");
        students = fileHandler.load();
        autoSaver = new AutoSaver(this, 5000);
        autoSaver.start();
    }

    public void addStudent(Student s) {
        students.add(s);
    }
    
    //

    public void removeStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                System.out.println("Removed successfully");
                return;
            }
        }
        System.out.println("Student not found");
    }

    public void updateStudent(int id, String name, int age, String major, double gpa)
            throws InvalidStudentDataException {

        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(name);
                s.setAge(age);
                s.setMajor(major);
                s.setGpa(gpa);
                System.out.println("Updated successfully");
                return;
            }
        }
        System.out.println("Student not found");
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void save() {
        fileHandler.save(students);
    }

    void autoSave() {
        fileHandler.save(students);
    }

    public void stopAutoSave() {
        autoSaver.stopSaving();
    }
}