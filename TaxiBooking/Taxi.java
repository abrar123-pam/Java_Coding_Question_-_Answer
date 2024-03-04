package TaxiBooking;

import java.util.ArrayList;
import java.util.List;

public class Taxi {
    static int taxiCount = 0;
    int id;
    char currSpot;
    int totalEarnings;
    int freeTime;
    List<String> trips;

    public Taxi(){
        currSpot = 'A';
        totalEarnings = 0;
        freeTime = 6;
        taxiCount = taxiCount +1;
        trips = new ArrayList<>();
        id = taxiCount;
    }

    public void setDetails(char currentSpot,int freeTime,int totalEarnings,String tripDetail){
        this.currSpot = currentSpot;
        this.freeTime = freeTime;
        this.totalEarnings=totalEarnings;
        this.trips.add(tripDetail);
    }

    public void printDetails()
    {
        //print all trips details
        System.out.println("Taxi - "+ this.id + " Total Earnings - " + this.totalEarnings);
        System.out.println("TaxiID    BookingID    CustomerID    From    To    PickupTime    DropTime    Amount");
        for(String trip : trips)
        {
            System.out.println(id + "        " + trip);
        }
        System.out.println("--------------------------------------------------------------------------------------");
    }

    public void printTaxiDetails()
    {
        //print total earningand taxi details like current location and free time
        System.out.println("Taxi - "+ this.id + " Total Earnings - " + this.totalEarnings + " Current spot - " + this.currSpot +" Free Time - " + this.freeTime);
    }
}
