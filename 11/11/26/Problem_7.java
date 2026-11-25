//WAP to copy one array elements into another
import java.util.*;
public class Problem_7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        System.out.print("Enter elements: ");
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array: " + java.util.Arrays.toString(arr));

        int dup[] = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            dup[i] = arr[i];
        }
        System.out.println("Duplicate Array: " + java.util.Arrays.toString(dup));
        sc.close();
    }
}