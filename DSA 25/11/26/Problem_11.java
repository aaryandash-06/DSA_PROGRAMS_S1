//WAP to find power of 3
import java.util.Scanner;
public class Problem_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the exponent (non-negative integer): ");
        int exp = sc.nextInt();

        long result = 1;
        for (int i = 0; i < exp; i++) {
            result *= 3;
        }   
        
        System.out.println("3 to the power of " + exp + " is: " + result);
        sc.close();
    }
}


