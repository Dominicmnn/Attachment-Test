
// Write a program to generate the Fibonacci sequence up to 100.



 class FibonacciSequence {
    public static void main(String[] args) {
        int n = 100;
        int a = 0, b = 1;
        
        System.out.println("Fibonacci sequence from 0 to 100:");
        System.out.print(a + " ");
        
        while (b <= n) {
            System.out.print(b + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
