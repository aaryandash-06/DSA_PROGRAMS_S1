//WAP to find smallest element in array
import java.util.*;
public class Problem_4 {
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
        
        int smallest = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < smallest)
                smallest = arr[i];
            }

        System.out.println("Smallest element: " + smallest);
        sc.close();
        }
        
        
        
    }

