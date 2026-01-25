import java.util.*;

public class BipartiteGraph {
    
    static class Edge {
        int src;
        int dest;

        public Edge (int s, int d) {
            this.src = s;
            this.dest = d;
        }

        public static boolean isBipartite(ArrayList<Edge>[] graph) {

            int[] col = new int[graph.length];
            for(int i=0; i<col.length; i++) {
                col[i] = -1;
            }

            for(int i=0; i<graph.length; i++) {
                if(col[i] == -1) {
                    if(isBipartiteUtil(graph, col, i)) {
                        return false;
                    }
                }
            }

            return true;

        }

        public static boolean isBipartiteUtil(ArrayList<Edge>[] graph, int[] col, int src) {
            
            Queue<Integer> q = new LinkedList<>();

            col[src] = 0;
            q.add(src);

            while(!q.isEmpty()) {

                int curr = q.remove();

                for(int i=0; i<graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);

                    if(col[e.dest] != -1) {
                        if(col[e.dest] == col[curr]) return true;
                    }
                    else if(col[e.dest] == -1) {
                        q.add(e.dest);
                        if(col[curr] == 0) col[e.dest] = 1;
                        else if (col[curr] == 1) col[e.dest] = 0;
                    }
                }
            }

            return false;
        }

        public static void main(String[] args) {
            
            int v = 5;
            ArrayList<Edge>[] graph = new ArrayList[v];

            for(int i=0; i<graph.length; i++) {
                graph[i] = new ArrayList<>();
            }

            graph[0].add( new Edge(0, 1));
            graph[0].add( new Edge(0, 2));

            graph[1].add( new Edge(1, 0));
            graph[1].add( new Edge(1, 3));

            graph[2].add( new Edge(2, 0));
            graph[2].add( new Edge(2, 4));

            graph[3].add( new Edge(3, 1));
            graph[3].add( new Edge(3, 4));

            graph[4].add( new Edge(4, 2));
            graph[4].add( new Edge(4, 3));


            System.out.println(isBipartite(graph));

        }
    }
}