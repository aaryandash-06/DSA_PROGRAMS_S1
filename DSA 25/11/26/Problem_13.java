// WAP to reverse a given number
import java.util.*;
public class Problem_13 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;         
            reversed = reversed * 10 + digit; 
            num /= 10;                     
        }
        System.out.println("Reversed Number: " + reversed); 
        sc.close();
    }
}

    

