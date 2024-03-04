package TaxiBooking;
/*
The are 6 points(A,B,C,D,E,F) 15 KM apart 60 min travel between each, n taxis all taxis at A starting A ---> B (15KM)
100 rs for first 5 KM and then 10 for each of the further KMs, rate from pickup to drop only
pickup time example : 9 hrs, 15 hrs

When a customer books a Taxi, a free taxi at that point is allocated
-If no free taxi is available at that point, a free taxi at the nearest point is allocated.
-If two taxi’s are free at the same point, one with lower earning is allocated
-If no taxi is free at that time, booking is rejected


Input 1:
Customer ID: 1
Pickup Point: A
Drop Point: B
Pickup Time: 9

Output 1:
Taxi can be allotted.
Taxi-1 is allotted

*/

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void booktaxi(int id,char pickupPoint,char dropPoint,int p_time,List<Taxi> freeTaxi){

        // to find nearest
        int min = 999;

        //distance between pickup and drop
        int distanceBetweenpickUpandDrop = 0;

        //this trip earning
        int earning = 0;

        //when taxi will be free next
        int nextfreeTime = 0;

        //where taxi is after trip is over
        char nextSpot = 'Z';

        //booked taxi
        Taxi bookedTaxi = null;

        //all details of current trip as string
        String tripDetail = "";

        for(Taxi t:freeTaxi){
            int distanceBetweenCustomerandTaxi = Math.abs((t.currSpot-'0')-(pickupPoint-'0')) * 15;
            if(distanceBetweenCustomerandTaxi < min){
                bookedTaxi = t;
                distanceBetweenpickUpandDrop = Math.abs((dropPoint - '0')-(pickupPoint-'0'))*15;
                earning = (distanceBetweenpickUpandDrop-5)*10+100;

                //drop Time Calculation
                int dropTime = p_time + distanceBetweenpickUpandDrop / 15;

                nextfreeTime = dropTime;

                nextSpot = dropPoint;
                tripDetail = id+"         "+id+"         "+pickupPoint+"         "+dropPoint+"         "+p_time+"         "+dropTime+"         "+earning;
                min = distanceBetweenCustomerandTaxi;
            }

        }

        bookedTaxi.setDetails(nextSpot,nextfreeTime,bookedTaxi.totalEarnings+earning,tripDetail);
        System.out.println("Taxi "+bookedTaxi.id+" booked");
    }
    public static List<Taxi> getFreeTaxi(List<Taxi> taxis, int p_time,char pickupPoint){
        List<Taxi> freeTaxi = new ArrayList<>();
        for(Taxi t:taxis){
            if(t.freeTime <= p_time && (Math.abs(t.currSpot - '0')-(pickupPoint - '0'))<= pickupPoint -'0'){
                freeTaxi.add(t);
            }
        }
        return freeTaxi;
    }

    public static List<Taxi> createTaxis(int n){
        List<Taxi> taxis = new ArrayList<>();

        for (int i=0;i<n;i++){
            taxis.add(new Taxi());
        }
        return taxis;
    }
    public static void main(String[] args) {
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        List<Taxi> taxis = createTaxis(4);
        int id =1;
        while (loop){
            System.out.println("1.Book\n2.Print Details\n3.Exit");
            int choice = sc.nextInt();

            switch (choice){

                case 1:
                    System.out.println("Enter Pickup Point");
                    char pickupPoint = sc.next().charAt(0);
                    System.out.println("Enter Drop Point");
                    char dropPoint = sc.next().charAt(0);
                    System.out.println("Enter Pick up Time");
                    int p_time = sc.nextInt();

                    if(pickupPoint < 'A'||dropPoint > 'F' || pickupPoint > 'F' || dropPoint <'A' ){
                        System.out.println("The Valid Taxi Stations Are [ A,B,C,D,E,F ]");
                            break;
                    }

                    List<Taxi> freeTaxi = getFreeTaxi(taxis,p_time,pickupPoint);

                    if(freeTaxi.size() == 0){
                        System.out.println("No Taxi is Available");
                        break;
                    }
                    booktaxi(id,pickupPoint,dropPoint,p_time,freeTaxi);
                    id++;
                    break;

                case 2:
                    for(Taxi t : taxis)
                        t.printTaxiDetails();
                    for(Taxi t : taxis)
                        t.printDetails();
                    break;

                case 3:
                    loop = false;
                    break;
            }
        }
    }
}
