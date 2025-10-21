import java.util.*;

public class MaxChainPair {
    public static void main(String[] args) {
        int ratio[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};

        Arrays.sort(ratio, Comparator.comparing(o -> o[1]));

        int ans = 1;
        int lastEnd = ratio[0][1];

        for(int i=1; i<ratio.length; i++) {
            if(ratio[i][0]>lastEnd) {
                ans++;
                lastEnd=ratio[i][1];
            }
        }
        System.out.println("Max length of chain: "+ans);

    }
}
