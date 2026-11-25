//Write a java program to merge 2 arrays
import java.util.*;
public class Problem_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of 1st array: ");
        int size1 = sc.nextInt();
        System.out.print("Enter elements of 1st array: ");
        int[] arr1 = new int[size1];
        for(int i = 0; i<size1; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("1st Array: " + java.util.Arrays.toString(arr1));

            
        System.out.print("Enter size of 2nd array: ");
        int size2 = sc.nextInt();
        System.out.print("Enter elements of 2nd array: ");
        int[] arr2 = new int[size2];
        for(int i = 0; i<size2; i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println("2nd Array: " + java.util.Arrays.toString(arr2));

        int mergedArray[] = new int[arr1.length + arr2.length];

        for(int i = 0; i < arr1.length; i++){
            mergedArray[i] = arr1[i];
        }

        for(int i = 0; i < arr2.length; i++){
            mergedArray[arr1.length + i] = arr2[i];
        }

        System.out.print("Merged Array: ");
        for(int element: mergedArray){
            System.out.print(element + " ");
        }
        sc.close();
    }
}
