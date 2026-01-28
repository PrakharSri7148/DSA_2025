import java.util.*;

public class KruskalAlgorithm {

    static class Edge implements Comparable<Edge> {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }

        @Override
        public int compareTo(Edge e1) {
            return this.wt - e1.wt;
        }

    }
    static int n = 8;
    static int[] par = new int[n];
    static int[] rank = new int[n];

    public static int find(int x) {
        if( x == par[x]) return x;
        return find(par[x]);
    }

    public static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);

        if(rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        }
        else if (rank[parA] < rank[parB]) {
            par[parA] = parB;
        }
        else {
            par[parB] = parA;
        }
    }

    public static void kruskal(ArrayList<Edge> edges) {
        Collections.sort(edges);
        int V = 4;

        int minCost = 0;
        int count = 0;

        for(int i=0; count < V-1; i++ ) {
            Edge e = edges.get(i);

            int parA = find(e.src);
            int parB = find(e.dest);

            if(parA != parB) {
                union(e.src, e.dest);
                count++;
                minCost += e.wt;
            }

        }

        System.out.println(minCost);
    }
    public static void main(String[] args) {

        for(int i=0; i<par.length; i++) {
            par[i] = i;
        }

        ArrayList<Edge> edges = new ArrayList<>();

        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));
        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(3, 2, 50));

        kruskal(edges);

    }
}
