package trainingprojects.taskTwo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

public class StudentProcess {

    LinkedList<Student> students;

    public StudentProcess(LinkedList<Student> students) {
        this.students = students;
    }

    public void addEntry(Student student) {
        if (students.isEmpty()) {
            students.add(student);
            System.out.println("Student has been added.");
        } else {
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getStuID().equals(student.getStuID())) {
                    System.out.println("Student exists!!");
                } else {
                    students.add(student);
                    System.out.println("Student has been added.");
                }

            }

        }
    }

    public void deletEntry(String id) {
        if (students.isEmpty()) {
            System.out.println("No Student found!!");
        } else {
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getStuID().equals(id)) {
                    students.remove(i);
                    System.out.println("Student was deleted.");
                } else {
                    System.out.println("No Student found!!");
                }
            }
        }
    }

    public void searchID(String id) {
        if (students.isEmpty()) {
            System.out.println("Sorry Record Does Not Exist!!");
        } else {
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getStuID().equals(id)) {
                    System.out.println("*************************************************");
                    System.out.println("**********R E C O R D    F O U N D!!*************");
                    System.out.println("*************************************************");
                    students.get(i).displayStudentInfo();
                } else {
                    System.out.println("Sorry Record Does Not Exist!!");
                }
            }
        }
    }

    public boolean modifyEntry(String id) {
        if (students.isEmpty()) {
            System.out.println("Sorry Record Does Not Exist!!");
        } else {
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getStuID().equals(id)) {
                    System.out.println("*************************************************");
                    System.out.println("**********R E C O R D    F O U N D!!*************");
                    System.out.println("*************************************************");
                    students.get(i).displayStudentInfo();
                    return true;
                } else {
                    System.out.println("Sorry Record Does Not Exist!!");
                }
            }
        }
        return false;
    }

    public void writToFile(LinkedList<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\HP\\Documents\\NetBeansProjects\\TrainingProjects\\src\\taskTwo\\data.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            fos.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public LinkedList<Student> readFromFile() {
        LinkedList<Student> students = new LinkedList<>();
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Documents\\NetBeansProjects\\TrainingProjects\\src\\taskTwo\\data.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (LinkedList<Student>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }
}
