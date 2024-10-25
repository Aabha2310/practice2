public class Factorial {
    public static void main(String[] args) {
        int number = 5; // Number for which factorial is to be calculated
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
    
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        } else {
            return n * calculateFactorial(n - 1); // Recursive call
        }
    }
}
