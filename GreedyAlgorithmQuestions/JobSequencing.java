import java.util.*;

public class JobSequencing {
    public static void main(String[] args) {
        int job[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

        Arrays.sort(job, Comparator.comparing(o ->o[1]));

        ArrayList<Integer> val = new ArrayList<>();

        int time = 0;
        for(int i=job.length-1; i>=0; i--) {
            if(job[i][0] > time) {
                time++;
                val.add(job[i][1]);
            }
        }

        System.out.println("Time taken: "+time);
        for(int i=0; i<val.size(); i++) {
            System.out.print(val.get(i)+" ");
        }
    }
}
