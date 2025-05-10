package model;

public class Student {
    String name;
    int age;
    String gender;
    int studentID;

    public Student(String name, int age, String gender, int studentID) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.studentID = studentID;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public int getStudentID() {
        return studentID;
    }
    public String getName() {
        return name;
    }
}
