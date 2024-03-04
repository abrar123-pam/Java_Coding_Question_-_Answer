package RailwayReservationSystem;

public class Passenger {

    static int id = 1;
    String name;
    int age;
    String gender;
    String berth;
    int passengerId = id++;
    String allotted;
    int seatNumber;


    public Passenger(String name, int age, String gender, String berth) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.berth = berth;
        this.allotted = "";
        this.seatNumber = -1;
    }
}
