//WAP to find factorial of a given number

import java.util.*;
public class Problem_10 {
    static int  Factorial(int n){
        if(n<0) return -1;

        if(n == 0 || n == 1)  return 1;

        if(n > 0){
            return n * Factorial(n - 1);
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int result = Factorial(n);

        System.out.println("Factorial of " + n + " is: " + result);
        sc.close();
    }
}
