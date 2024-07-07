package Serialization.Models;

import java.io.Serializable;

public class Student implements Serializable {
    private final static long serialVersionUID = 1L;


    private String name;
    private String dept;
    private int passedOutYear;
    private int rollNo;

    public Student(String name, String dept, int passedOutYear, int rollNo) {
        this.name = name;
        this.dept = dept;
        this.passedOutYear = passedOutYear;
        this.rollNo = rollNo;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getPassedOutYear() {
        return passedOutYear;
    }

    public void setPassedOutYear(int passedOutYear) {
        this.passedOutYear = passedOutYear;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return rollNo+"";
    }
}
