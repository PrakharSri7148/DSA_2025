import java.util.*;

public class ConnectingCities {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static class Pair implements Comparable<Pair> {
        int v;
        int cost;

        public Pair(int v, int cost) {
            this.v = v;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }

    public static void minCost(ArrayList<Edge>[] graph) {

        boolean vis[] = new boolean[graph.length];

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0));
        int finalCost = 0;

        while(!pq.isEmpty()) {

            Pair curr = pq.remove();

            if(!vis[curr.v]) {
                vis[curr.v] = true;
                finalCost += curr.cost;

                for(int i=0; i<graph[curr.v].size(); i++) {
                    Edge e = graph[curr.v].get(i);

                    pq.add(new Pair(e.dest, e.wt));
                }
            }
            
        }

        System.out.println(finalCost);
    }

    public static void main(String[] args) {
        
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];

        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add( new Edge(0, 1, 1));
        graph[0].add( new Edge(0, 2, 2));
        graph[0].add( new Edge(0, 3, 3));
        graph[0].add( new Edge(0, 4, 4));

        graph[1].add( new Edge(1, 0, 1));
        graph[1].add( new Edge(1, 2, 5));
        graph[1].add( new Edge(1, 4, 7));

        graph[2].add( new Edge(2, 1, 5));
        graph[2].add( new Edge(2, 0, 2));
        graph[2].add( new Edge(2, 3, 6));

        graph[3].add( new Edge(3, 2, 6));
        graph[3].add( new Edge(3, 0, 3));

        graph[4].add( new Edge(4, 0, 4));
        graph[4].add( new Edge(4, 1, 7));


        minCost(graph);
    }
}
