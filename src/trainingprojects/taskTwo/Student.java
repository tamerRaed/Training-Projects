package trainingprojects.taskTwo;

import java.io.Serializable;

public class Student implements Serializable{

    private String StuID;
    private String age;
    private String name;
    private String address;
    private String gender;
    private String status;
    private String contactNum;
    private String dateOfBirth;

    public Student(String StuID, String age, String name, String address, String gender, String status, String contactNum, String dateOfBirth) {
        this.StuID = StuID;
        this.age = age;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.status = status;
        this.contactNum = contactNum;
        this.dateOfBirth = dateOfBirth;
    }

    public String getStuID() {
        return StuID;
    }

    public void setStuID(String StuID) {
        this.StuID = StuID;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public void displayStudentInfo(){
        System.out.println("Student ID : "+ this.StuID);
        System.out.println("Student Name : "+ this.name);
        System.out.println("Student Age : "+ this.age);
        System.out.println("Student Address : "+ this.address);
        System.out.println("Student Gender : "+ this.gender);
        System.out.println("Student Status : "+ this.status);
        System.out.println("Student Contact Number : "+ this.contactNum);
        System.out.println("Student Date of Birth : "+ this.dateOfBirth);
    }
}
