    
    // Write a program that takes an integer as input and returns an integer with reversed digit 
// ordering.

// Examples:
// For input 500, the program should return 5.
// For input -56, the program should return -65.
// For input -90, the program should return -9.
// For input 91, the program should return 19.


 class ReverseInteger {
    public static int reverse(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return reversedNum;
    }
    
    public static void main(String[] args) {
        int input = 123456789;
        int reversed = reverse(input);
        System.out.println("Original number: " + input);
        System.out.println("Reversed number: " + reversed);
    }
}
