//WAP to search an element in the given array
import java.util.*;
public class Problem_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        System.out.print("Enter elements: ");
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println();
        
        System.out.println("Enter the target value to search: ");
        int target = sc.nextInt();
        
        int result1 = linearSearch(arr,target);
        int result2 = binarySearch(arr,target);

        if(result1 != -1){
            System.out.println("Element found at index: " + result1);
        }else{
            System.out.println("Element not available ");
        }
        sc.close();
    }

    public static int linearSearch(int[] arr, int target) {
        int steps = 0;
        for(int i = 0; i < arr.length; i++){
            steps++;
            if(arr[i] == target){
                System.out.println("Steps by Linear Search: " + steps);
                return i;
            }
        }
        System.out.println("Steps by Linear Search: " + steps);
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
       int steps = 0;
       int left = 0; 
       int right = arr.length - 1;

       while(left <= right){
        steps++;
        int mid = (left + right) / 2;
        if(arr[mid] == target){
            System.out.println("Steps by Binary Search: " + steps);
            return mid;
        }
        else if(arr[mid] < target){
            left = mid + 1;
        }
        else{
            right = mid - 1;
        }
       }
       System.out.println("Steps by Binary Search: " + steps);
       return -1;
    }
}
