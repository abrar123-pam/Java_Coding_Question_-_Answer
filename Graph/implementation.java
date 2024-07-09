package Graph;

import java.util.*;

class Node implements Comparable<Node> {
    int destination;
    int weight;

    public Node(int destination, int weight) {
        this.destination = destination;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Node{" +
                "destination=" + destination +
                ", weight=" + weight +
                '}';
    }
    @Override
    public int compareTo(Node o1) {
        return Integer.compare(this.weight,o1.weight);
    }
}

class graph{
    private int vertices;
    private List<List<Node>> adjacencyList;
    public graph(int vertices) {
        this.vertices = vertices;
        this.adjacencyList = new ArrayList<>(vertices);

        for (int i=0; i<vertices;i++){
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int des, int weight){
        Node node = new Node(des,weight);
        adjacencyList.get(src).add(node);
    }

    public void dijikstraAlgorithm(int st) {
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();
        int[] dist = new int[vertices];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[st] = 0;
        priorityQueue.add(new Node(st,0));

        while (!priorityQueue.isEmpty()){
            Node currentNode = priorityQueue.poll();
            int currentVertex = currentNode.destination;

            for(Node node : adjacencyList.get(currentVertex)){
                int newDist = dist[currentVertex]+node.weight;
                if(newDist < dist[node.destination]){
                    dist[node.destination] = newDist;
                    priorityQueue.add(new Node(node.destination,newDist));
                }
            }
        }

        printDijikstra(dist,st);
    }

    private void printDijikstra(int[] dist, int st) {
        System.out.println("Dijkstra's Algorithm starting from vertex " + st);
        for (int i = 0; i < dist.length; i++) {
            System.out.println("Vertex " + i + ": Distance = " + dist[i]);
        }
    }


//    public void printgraph(){
//        for (int i=0;i<vertices;i++){
//            List<Node > list = adjacencyList.get(i);
//            System.out.print("Vertex " + i + ": ");
//            for(Node n : list){
//                System.out.print(n + " ");
//            }
//            System.out.println();
//        }
//    }
}

public class implementation{
    public static void main(String[] args) {
        graph g = new graph(5);
        g.addEdge(0,1,4);
        g.addEdge(0,2,1);
        g.addEdge(1, 3, 1);
        g.addEdge(2, 1, 2);
        g.addEdge(2, 3, 5);
        g.addEdge(3, 4, 3);

        g.dijikstraAlgorithm(0);
        //g.printgraph();

    }
}
