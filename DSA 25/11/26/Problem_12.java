//WAP to print Fibonacci series upto the specified no.of terms

import java.util.Scanner;

public class Problem_12 {
        static int  Fibonacci(int n){
        if(n<0) return -1;

        if(n == 0 || n == 1)  return n;

        if(n > 0){
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            System.out.print("Fibonacci Series: ");
            for (int i = 0; i < n; i++) {
                System.out.print(Fibonacci(i) + " ");
            }
        }
        sc.close();
    }
}
