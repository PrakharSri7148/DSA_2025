import java.util.*;

public class minMaxElement {
    public static void main(String[] args) {

    int nums[] = {1,45,64,6,4,8};

    int max= nums[0];
    int min= nums[0];
        for(int i=0; i<nums.length; i++){
              if(nums[i]>max){
                   max = nums[i];
               }
         }

         for(int i=0; i<nums.length; i++){
            if(nums[i]<min){
                min = nums[i];
            }
         }

         System.out.println("Maximun element is: " + max);
         System.out.println("Minimun element is: " + min);

     }
    }
