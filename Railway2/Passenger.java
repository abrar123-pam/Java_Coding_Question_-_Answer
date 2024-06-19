package Railway2;

class Passenger{

    String name;
    int age;
    String berth;
    String pnr;
    String allotted;
    int seatNumber;
    String bookingStatus;
    String currentStatus;
    boolean isChild;


    Passenger(String name,int age,String berth,String pnr,boolean isChild){
        this.name = name;
        this.age = age;
        this.berth = berth;
        this.allotted = "";
        this.seatNumber = -1;
        this.pnr = pnr;
        this.bookingStatus = "";
        this.currentStatus = "";
        this.isChild = isChild;

    }
}
