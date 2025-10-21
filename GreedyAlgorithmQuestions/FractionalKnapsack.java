import java.util.*;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int val[]= {60, 100, 120};
        int weight[] = {10, 20, 30};
        int W= 50;


        double ratio[][] = new double[val.length][2];  
        // col[0] = index; col[1] = ratio

        for(int i=0; i<val.length; i++) {     //calculating the ratio and putting in 2D Array
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }

        Arrays.sort(ratio, Comparator.comparing(o -> o[1]));   // sorting for ascending order

        int capacity = W;
        int finalVal = 0;
        for(int i=ratio.length-1; i>= 0; i--) {
            int idx = (int)ratio[i][0];
            if(weight[idx]<= capacity) {    //only when you have to take the whole weight
                finalVal += val[idx];
                capacity -= weight[idx];
            }else{
                finalVal += capacity*ratio[i][1];
                capacity = 0;
                break;
            }
        }

        System.out.println("Final value: "+finalVal);
    }
}
