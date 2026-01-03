import java.util.*;

public class FlowerPlacement {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int size = flowerbed.length;
        int counter =0;
        boolean result = true;

        for(int i=0; i<flowerbed.length; i++) {
            if(i != 0 && i != size-1 && flowerbed[i] == 0) {
                if(flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                    flowerbed[i] = 1;
                    counter++;
                }
            }
            if(i == 0 && flowerbed[i] == 0 && (size == 1 || flowerbed[i+1] == 0)) {
                flowerbed[i] = 1;
                counter++;
            }

            if(i == size-1 && flowerbed[i] == 0 && flowerbed[i-1] == 0) {
                flowerbed[i] = 1;
                counter++;
            }
        }

        if(counter < n) result = false;

        return result;
    }
    public static void main(String[] args) {
        int [] flowerbed = {1,0,0,0,1};
        Scanner kbrd = new Scanner(System.in);

        int n = kbrd.nextInt();

        System.out.println(canPlaceFlowers(flowerbed, n));

    }
}
