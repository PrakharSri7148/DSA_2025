import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = kbrd.nextInt();

        if(year%400 == 0 || year%4==0 && year%100 != 0) {
            System.out.println("Its a leap year");
        } else System.out.println("Its not a leap year");

    }
}
