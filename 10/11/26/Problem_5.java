//WAP to count even and odd numbers in the array
import java.util.*;
public class Problem_5 {
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
        
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                count1++;
            }
            if(arr[i] % 2 != 0){
                count2++;
            }
        }
        System.out.println("No of even numbers: " + count1);
        System.out.println("No of odd numbers: " + count2);
        sc.close();
    }
}
