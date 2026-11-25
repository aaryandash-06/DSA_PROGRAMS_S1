//WAP to add the digits of a given number and print the sum
import java.util.*;
public class Problem_14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int sum = 0;

        while (num > 0) {
            sum = sum + (num % 10); 
            num = num / 10;         
        }
        System.out.println("Sum of the digits are: " + sum); 
        sc.close();
    }
}