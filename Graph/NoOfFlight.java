package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class Flight implements Comparable<Flight>{
    int toCity;
    int cost;

    public Flight(int toCity, int cost) {
        this.toCity = toCity;
        this.cost = cost;
    }

    @Override
    public int compareTo(Flight o) {
        return Integer.compare(this.cost,o.cost);
    }
}

class Solution{
    private int vertices;
    List<List<Flight>> adjacencyFlight;

    public Solution(int vertices) {
        this.vertices = vertices;
        this.adjacencyFlight = new ArrayList<>(vertices);

        for (int i=0;i<vertices;i++){
            adjacencyFlight.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int des, int weight){
        Flight flight = new Flight(des,weight);
        adjacencyFlight.get(src).add(flight);
    }

    public int findCheapestPrice(int src, int des, int k){
        PriorityQueue<Tuple> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(new Tuple(0,src,0));
        int[] dist = new int[vertices];
        for (int i=0;i<vertices;i++){
            Arrays.fill(dist,Integer.MAX_VALUE);
        }

        while (!priorityQueue.isEmpty()){
            Tuple tuple = priorityQueue.poll();
            int stop = tuple.stop;
            int city = tuple.city;
            int cost = tuple.cost;

            if(stop > k ) continue;

            for(Flight flight : adjacencyFlight.get(city)){
                int adjacencyCity = flight.toCity;
                int adjcost = flight.cost;

                if(adjcost+cost < dist[adjacencyCity] && stop <= k){
                    dist[adjacencyCity] = adjcost+cost;
                    priorityQueue.add(new Tuple(stop+1,adjacencyCity,cost+adjcost));
                }
            }
        }

        if(dist[des] == Integer.MAX_VALUE) return -1;

        return dist[des];
    }
}

class Tuple implements Comparable<Tuple>{
    int stop;
    int city;
    int cost;

    public Tuple(int stop, int city, int cost) {
        this.stop = stop;
        this.city = city;
        this.cost = cost;
    }

    @Override
    public int compareTo(Tuple o) {
        return Integer.compare(this.cost,o.cost);
    }
}
public class NoOfFlight {
    public static void main(String[] args) {
        Solution s = new Solution(4);

        s.addEdge(0,1,100);
        s.addEdge(1,2,100);
        s.addEdge(2,0,100);
        s.addEdge(1,3,600);
        s.addEdge(2,3,200);

        int ans = s.findCheapestPrice(0,3,1);
        System.out.println(ans);
    }
}
