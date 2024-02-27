

// Write a program that takes an integer as input and returns true if the input is a power of two.


// Examples: 
// 8=> returns true
// 6=> returns false

import java.util.Scanner;

 class PowerOfTwoChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        scanner.close();

        boolean result = isPowerOfTwo(num);
        
        if (result) {
            System.out.println(num + " is a power of two.");
        } else {
            System.out.println(num + " is not a power of two.");
        }
    }

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}