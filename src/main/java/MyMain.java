import java.util.Arrays;
public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int[] arr2 = new int[arr.length];
        int count = 0;
        for (int i = arr.length; i > 0; i--){
            arr2[count] = arr[i-1];
            count++; 
       }
        return arr2;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] <= arr[j]){
                    continue;
                }
                else {
                    int switcher = arr[i];
                    arr[i] = arr[j];
                    arr[j] = switcher;
                }
            }
        }
        return arr[arr.length - 2];
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
       double factor = (double)arr[1] / (double)arr[0];
        for (int i = 1; i < arr.length; i++){
            if ((double)arr[i] / (double)arr[i-1] != factor){
            return false;
       }
        }
       return true;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(reverse(arr)));
        int[] arr2 = {7, 20, 8, 3, 11, 15};
        System.out.println((secondLargest(arr2)));
        int[] arr3 = {1, 3, 9, 27, 81};
        System.out.println((isGeometric(arr3)));
        int[] arr4 = {9, 0, 6, 86, 12};
        System.out.println((isGeometric(arr4)));
    }
}
