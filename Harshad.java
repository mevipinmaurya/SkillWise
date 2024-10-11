import java.util.Scanner;

public class HarshadNumber {

    public static boolean isHarshad(int number) {
        int sumOfDigits = 0;
        int originalNumber = number;

        // Calculate the sum of the digits
        while (number > 0) {
            sumOfDigits += number % 10;
            number /= 10;
        }

        // Check if the original number is divisible by the sum of its digits
        return originalNumber % sumOfDigits == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (isHarshad(number)) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }

        scanner.close();
    }
}
