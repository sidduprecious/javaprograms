package numbers;
import java.util.Scanner;

public class FibonacciAllPrograms {

    // ===== REUSABLE RECURSIVE FIBONACCI METHOD =====
	static int fib(int n) {

	    if (n == 0) {
	        return 0;
	    }
	    else if (n == 1) {
	        return 1;
	    }
	    else {
	        return fib(n - 1) + fib(n - 2);
	    }
	}


    public static void main(String[] args) {

        // ============================================
        // 1. PRINT FIRST N FIBONACCI NUMBERS
        // ============================================
        int N = 10;
        System.out.println("First " + N + " Fibonacci numbers:");
        for (int i = 0; i < N; i++) {
            System.out.print(fib(i) + " ");
        }

        // ============================================
        // 2. Nth FIBONACCI NUMBER
        // ============================================
        int nth = 7;
        System.out.println("\n\n" + nth + "th Fibonacci number:");
        System.out.println(fib(nth));

        // ============================================
        // 3. CHECK IF A NUMBER IS FIBONACCI OR NOT
        // ============================================
        int num = 21;
        boolean isFibo = false;

        for (int i = 0; i <= 20; i++) {   // check first few fib numbers
            if (fib(i) == num) {
                isFibo = true;
                break;
            }
        }

        System.out.println("\nCheck Fibonacci:");
        if (isFibo)
            System.out.println(num + " is a Fibonacci number");
        else
            System.out.println(num + " is not a Fibonacci number");

        // ============================================
        // 4. SUM OF FIRST N FIBONACCI NUMBERS
        // ============================================
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += fib(i);
        }
        System.out.println("\nSum of first " + N + " Fibonacci numbers:");
        System.out.println(sum);
    }
}
