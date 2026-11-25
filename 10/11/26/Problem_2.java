//WAP to find sum and avg of all array elements
import java.util.*;
public class Problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        System.out.print("Enter elements of array: ");
        int[] array = new int[size];
        for(int i = 0; i<size; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Array: " + java.util.Arrays.toString(array));
        
        int sum = 0;
        double avg = 0;
        for(int i = 0; i<array.length;i++){
            sum = sum + array[i];
            avg = sum / size;
        }
        System.out.println("The sum of all elements of array is: " + sum);
        System.out.println("The avg of all elements of array is: " + avg);

        sc.close();
    }
}
