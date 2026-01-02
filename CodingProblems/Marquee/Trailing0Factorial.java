import java.util.*;

public class Trailing0Factorial {
    public static int count=0;

    public static void divide( int num) {
        if(num == 0) return;
        
        num = num/5;
        count++;
        divide(num);
        return;

    }

    public static int trailingZeros(int num) {
        if(num == 0) return 0;

        divide(num);

        int power = count-1;
        int num0 = 0;

        while(power != 0) {
            num0 = num0 + num/(int)Math.pow(5,power);
            power--;
        }

        return num0;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int result = trailingZeros(num);

        System.out.println(result);

    }
}
