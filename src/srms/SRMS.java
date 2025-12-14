package srms;

import java.util.ArrayList;

public class SRMS {

    private final ArrayList<Student> students;
    private final FileHandler fileHandler;
    private final AutoSaver autoSaver;

    public SRMS() {
        fileHandler = new FileHandler("students.ser");
        students = fileHandler.load();
        autoSaver = new AutoSaver(this ,5000);
        autoSaver.start();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void removeStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                return;
            }
        }
    }

    public void updateStudent(int id, String name, int age, String major, double gpa) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(name);
                s.setAge(age);
                s.setMajor(major);
                s.setGpa(gpa);
                return;
            }
        }
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