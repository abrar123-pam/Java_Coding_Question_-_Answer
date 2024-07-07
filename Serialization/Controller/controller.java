package Serialization.Controller;

import Serialization.Models.Chairman;
import Serialization.Models.Student;
import Serialization.Models.Teachers;

import java.io.*;
import java.util.ArrayList;

public class controller implements Serializable {
    ArrayList<Student> studentArrayList = new ArrayList<>();
    ArrayList<Teachers> teachersArrayList = new ArrayList<>();
    ArrayList<Chairman> chairmanArrayList = new ArrayList<>();
    private final static long serialVersionUID = 1L;

    private static controller instance = null;
    private static  String path = "C:\\Users\\Abrar Musharraf P\\IdeaProjects\\Practice\\src\\Serialization\\database.bin";
    public void save(){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(this);
            System.out.println("Data Saved Successfully");
            oos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static controller load(){
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);

              instance= (controller)ois.readObject();
              ois.close();
            System.out.println("Data Loaded Successfully");

            System.out.println(instance.studentArrayList);
        }catch (Exception e){
//            e.printStackTrace();
            instance = new controller();
        }
        return instance;
    }

    public void displayteacher(String n) {
        for (Teachers teachers : teachersArrayList){
            if(teachers.getName().equals(n)){
                System.out.println("Data found");
                System.out.println(teachers.getName());
                System.out.println(teachers.getSubject());
                System.out.println(teachers.getSaalry());
            }
        }
    }

    public void addStudent(Student student) {

        studentArrayList.add(student);
        System.out.println(studentArrayList);
    }

    public boolean isValid(int rollNo) {
        System.out.println(studentArrayList);
        for (Student student : studentArrayList){
            if(student.getRollNo() == rollNo){
                return  true;
            }
        }

        return  false;
    }

    public void display(int rollNo) {
        for(Student student : studentArrayList){
            if (student.getRollNo() == rollNo){
                System.out.println("Welcome back");
                System.out.println("Name : "+student.getName());
                System.out.println("DEPT : "+student.getDept());
                System.out.println("passed "+ student.getPassedOutYear());
                System.out.println("Roll no "+rollNo);
            }
        }
    }

    public void addTeacher(Teachers teachers) {
        teachersArrayList.add(teachers);
    }

    public boolean isValidName(String n) {
        for (Teachers t: teachersArrayList){
            if (t.getName().equals(n)){
                return true;
            }
        }
        return false;
    }

}
