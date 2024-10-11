import java.util.Scanner;

public class FactorialCalculator {

    // Iterative method to calculate factorial
    public static long factorialIterative(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    // Recursive method to calculate factorial
    public static long factorialRecursive(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * factorialRecursive(number - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();
        
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long iterativeResult = factorialIterative(number);
            long recursiveResult = factorialRecursive(number);

            System.out.println("Factorial of " + number + " (Iterative): " + iterativeResult);
            System.out.println("Factorial of " + number + " (Recursive): " + recursiveResult);
        }

        scanner.close();
    }
}
