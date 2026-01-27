import java.util.*;

public class FlightGraph {
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

    static class Info {

        int v;
        int cost;
        int stops;

        public Info(int v, int cost, int s) {
            this.v = v;
            this.cost = cost;
            this.stops = s;
        }
    }

    public static void flight(ArrayList<Edge>[] graph, int src, int dest, int k) {
        int[] dist = new int[graph.length];
        for(int i=0; i<graph.length; i++) {
            if(i != src) dist[i] = Integer.MAX_VALUE;
        }


        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));

        while(!q.isEmpty()) {
            Info curr = q.remove();
            if(curr.stops > k) break;

            for(int i=0; i<graph[curr.v].size(); i++) {
                Edge e = graph[curr.v].get(i);

                int u = e.src;
                int v = e.dest;
                int wt = e.wt;

                if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v] && curr.stops <=k) {
                    dist[v] = dist[u] + wt;
                    q.add(new Info(v, dist[v], curr.stops + 1));
                }
            }
        }

        System.out.println(dist[dest]);
    }

    public static void main(String[] args) {
        
        int v = 4;
        ArrayList<Edge>[] graph = new ArrayList[v];

        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add( new Edge(0, 1, 100));

        graph[1].add( new Edge(1, 2, 100));
        graph[1].add( new Edge(1, 3, 600));

        graph[2].add( new Edge(2, 0, 200));
        graph[2].add( new Edge(2, 3, 200));

        int src = 0;
        int dest = 3;
        int k = 1;

        flight(graph, src, dest, k);
    }
}
