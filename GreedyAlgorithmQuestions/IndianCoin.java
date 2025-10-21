import java.util.*;

public class IndianCoin {
    public static void main(String[] args) {
        int coin[] = {2000, 500, 100, 50, 20, 10, 5, 2, 1};

        int count = 0;
        int amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();

            for(int i=0; i<coin.length; i++) {
                if(coin[i]<=amount) {
                    while(coin[i]<=amount){
                    count++;
                    ans.add(coin[i]);
                    amount = amount-coin[i];
                    }
                }
            }
        System.out.print(count);
        System.out.print("{ ");
        for(int i=0; i<ans.size(); i++) {
            System.out.print("("+ans.get(i)+")"+" ");
        }
        System.out.print("}");
    }
}