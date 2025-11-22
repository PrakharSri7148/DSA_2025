public class ArrayMonotonic {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 10, 11};

        boolean inc = true;
        boolean dec = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) inc = false;
            if (arr[i] < arr[i + 1]) dec = false;
        }

        if (inc || dec) System.out.println("The array is monotonic");
        else System.out.println("The array is not monotonic");
    }
}
