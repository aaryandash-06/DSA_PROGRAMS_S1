//WAP to find largest element in array
import java.util.*;
public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        System.out.println("Enter elements: ");
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: " + java.util.Arrays.toString(arr));
        
        int largest = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest element: " + largest);
        sc.close();
        
    }
}
