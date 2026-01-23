import java.util.*;

public class graphHasPath {
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

    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited) {
        if( src == dest) return true;
        visited[src] = true;

        for(int i=0; i<graph[src].size(); i++) {

            Edge e = graph[src].get(i);
            if(!visited[e.dest] && hasPath(graph, e.dest, dest, visited )) {
                return true;
            }
        }

        return false;
        
    }

    public static void main(String[] args) {
        
        int v = 7;

        ArrayList<Edge>[] graph = new ArrayList[v];

        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        //adding 0th vertex 
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        //adding 1st vertex
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        //adding 2nd vertex
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        //adding 3rd vertex
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        //ading 4th vertex
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        //adding 5th vertex
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        //adding 6th vertex
        graph[6].add(new Edge(6, 5, 1));

        boolean[] visited = new boolean[graph.length];

        
        System.out.println(hasPath(graph, 0, 5, visited));

    }
}
