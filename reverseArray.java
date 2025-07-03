import java.util.*;

public class reverseArray {
   public static void reverse(int arr[]) {   //reverse function
    int i = 0;
    int j = arr.length-1;
    while(i<j){
        int temp = arr[i];     //swaping starting and ending elements 
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }

   }
   
public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6};           //initializing the array

    //printng array before reversing 
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]);
    }

    System.out.println();

    reverse(arr);     //function call

    //printng array after reversing
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]);
    }
}
}
