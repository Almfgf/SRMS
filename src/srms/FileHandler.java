package srms;

import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandler {

    private final String filename;

    public FileHandler(String filename) {
        this.filename = filename;
    }

    public void save(ArrayList<Student> students) {
        try (ObjectOutputStream out =
         new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(students);
        } catch (IOException e) {
            System.out.println("Saving failed");
        }
    }

    @SuppressWarnings("unchecked")
    public ArrayList<Student> load() {
        try (ObjectInputStream in =
          new ObjectInputStream(new FileInputStream(filename))) {
            return (ArrayList<Student>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }
}