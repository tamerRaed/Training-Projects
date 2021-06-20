package trainingprojects.taskTwo;

import java.util.LinkedList;
import java.util.Scanner;

public class main {

    static Scanner in;
    static StudentProcess studentProcess;
    static LinkedList<Student> students;
    public static void displayMenu() {
        System.out.println("[1]Add New Student Record");
        System.out.println("[2]Delete Student Record");
        System.out.println("[3]Display Student Record");
        System.out.println("[4]Modify Student Record ");
        System.out.println("[5]Search Student Record");
        System.out.println("[6]Exit The Program");
        System.out.println("Please Enter Your Choice: ");
    }

    public static void main(String[] args) {
        int retry = 1;
        String password = "skm";
        students = new LinkedList<>();
        in = new Scanner(System.in);
        studentProcess = new StudentProcess(students);
        System.out.println("SCHOOL OF COMPUTING & TECHNOLOGY.");
        System.out.println("*********************************");
        System.out.println("*********************************");
        while (true) {
            System.out.println("Enter The Password: ");
            String pass = in.next();
            retry++;
            if (pass.equals(password)) {
                System.out.println("Access approved!");
                students = studentProcess.readFromFile();
                System.out.println("**********************************************");
                System.out.println("*          STUDENT REGISTRATION PROGRAM      *");
                System.out.println("**********************************************");
                while (true) {
                    displayMenu();
                    int choic = in.nextInt();
                    switch (choic) {
                        case 1:
                            addStudent();
                            continue;
                        case 2:
                            System.out.println("Enter Studnt id: ");
                            String id = in.next();
                            studentProcess.deletEntry(id);
                            break;
                        case 3:
                            for(Student student : students){
                                student.displayStudentInfo();
                            }
                            continue;
                        case 4:
                            continue;
                        case 5:
                            System.out.println("Enter Student id: ");
                            String searchId = in.next();
                            studentProcess.searchID(searchId);
                            continue;
                        case 6:
                            System.exit(0);
                            continue;
                        default:
                            System.out.println("INVALID CHOICE!!! PLEASE ENTER AGAIN!");
                            continue;
                    }
                    break;
                }

            } else {
                System.out.println("Incorrect Password!");
                if (retry <= 3) {
                } else if (retry > 3) {
                    System.out.println("Maximum 3 try only! Bye!");
                    System.exit(0);
                }
            }
        }

//        Student student = new Student(0, 20, "Tamer", "Gaza", "Male", "True", "0592899024", "22/8/1999");
//        studentProcess.addEntry(student);
//
//        students.get(0).displayStudentInfo();
//
//        System.out.println(studentProcess.modifyEntry(1));
    }

    private static void addStudent() {
        while (true) {
            System.out.println("Student ID: ");
            String id = in.next();

            System.out.println("Student Name: ");
            String name = in.next();

            System.out.println("Student address: ");
            String address = in.next();

            System.out.println("Student Gender [F or M]: ");
            String gender = in.next();

            System.out.println("Student Age: ");
            String age = in.next();

            System.out.println("Student Contact No: ");
            String contactNum = in.next();

            System.out.println("Marital Status: ");
            String status = in.next();

            System.out.println("Student D.O.B [DD/MM/YYYY]: ");
            String dob = in.next();
            
            if(checkFields(id, name, gender, address, age, contactNum, status, dob)){
                Student student = new Student(id, age, name, address, gender, status, contactNum, dob);
                studentProcess.addEntry(student);
                studentProcess.writToFile(students);
                break;
            }else{
                continue;
            }

        }
    }

    public static boolean checkFields(String id, String name, String gender, String address, String age, String contactNum, String status, String dob) {
        if (id.length() != 4) {
            System.out.println("<<Student ID should not be Empty or It should only 4 digits>>");
            return false;
        } else if (name.length() < 4) {
            System.out.println("<<Name should not be Empty or It should not less than 4 characters.>>");
            return false;
        }else if(contactNum.length() < 8){
            System.out.println("<<Contact No should not be Empty or should not less than 8 characters>>");
            return false;
        }else if (gender.length() != 1) {
            System.out.println("<<Gender should not be Empty or It should be only M or F >>");
            return false;
        }else if (dob.length() != 10) {
            System.out.println("<<Student D.O.B should not be Empty or It should Must be 10 characters  >>");
            return false;
        }else if (address.length() < 10) {
            System.out.println("<<Address should not be Empty or should not less than 10 characters  >>");
            return false;
        }else if (status.length() > 10) {
            System.out.println("<<Marital Status should not be Empty or should not exceed 10 characters>>");
            return false;
        }
        return true;
    }
}
