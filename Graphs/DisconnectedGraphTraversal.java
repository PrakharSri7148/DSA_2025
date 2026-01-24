import java.util.*;

public class DisconnectedGraphTraversal {
    
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
    public static void bfs(ArrayList<Edge>[] graph) {
        boolean[] vis = new boolean[graph.length];

        for(int i=0; i<graph.length; i++) {
            if(!vis[i]) {
                bfsutil(graph, i, vis);
            }
        }
    }

    public static void bfsutil (ArrayList<Edge>[] graph, int src, boolean[] vis) {
        Queue<Integer> q = new LinkedList<>();
        q.add(src); //source 0
        vis[src] = true;

        while(!q.isEmpty()) {
            int curr = q.remove();
            System.out.println(curr+" ");

            for(int i=0; i<graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                if(!vis[e.dest]) {
                    vis[e.dest] = true;
                    q.add(e.dest);
                }
            }
        }
    }
    
    
    public static void main(String[] args) {
        
        int v = 5;
        
        ArrayList<Edge>[] graph = new ArrayList[v];

        for(int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        // Component 1
        graph[0].add(new Edge(0, 1, 1));
        graph[1].add(new Edge(1, 0, 1));

        graph[1].add(new Edge(1, 2, 1));
        graph[2].add(new Edge(2, 1, 1));

        // Component 2
        graph[3].add(new Edge(3, 4, 1));
        graph[4].add(new Edge(4, 3, 1));


        bfs(graph);

    }
}
