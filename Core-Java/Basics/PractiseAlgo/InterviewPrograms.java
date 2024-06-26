import java.util.*;

public class InterviewPrograms {

    public static void main(String[] args) {
        System.out.println("Prime Number: " + isPrime(29));
        System.out.println("Fibonacci Series: " + Arrays.toString(fibonacciSeries(10)));
        System.out.println("Fibonacci Series without Recursion: " + Arrays.toString(fibonacciSeriesWithoutRecursion(10)));
        System.out.println("Factorial: " + factorial(5));
        printPyramidPattern(5);
        System.out.println("Sum of Digits: " + sumOfDigits(1234));
        System.out.println("Is Palindrome: " + isPalindrome(121));
        System.out.println("Is Leap Year: " + isLeapYear(2024));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(153));
        System.out.println("Is Strong Number: " + isStrongNumber(145));
        System.out.println("Is Perfect Number: " + isPerfectNumber(28));
        int[] swapped = swapNumbers(5, 10);
        System.out.println("Swapped Numbers: a = " + swapped[0] + ", b = " + swapped[1]);
        System.out.println("Is Harshad Number: " + isHarshadNumber(18));
        System.out.println("Is Even: " + isEven(10));
        System.out.println("Reversed Number: " + reverseNumber(1234));
        System.out.println("Binary: " + decimalToBinary(10));
    }

    // Prime Number Program
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Fibonacci Series
    public static int[] fibonacciSeries(int n) {
        if (n <= 0) return new int[]{};
        int[] series = new int[n];
        series[0] = 0;
        if (n > 1) series[1] = 1;
        for (int i = 2; i < n; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }
        return series;
    }

    // Fibonacci Series without Recursion
    public static int[] fibonacciSeriesWithoutRecursion(int n) {
        return fibonacciSeries(n);
    }

    // Factorial Number Program
    public static long factorial(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    // Pattern Programs (Pyramid Pattern)
    public static void printPyramidPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Sum of Digits in a Program
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }

    // Given Number is Palindrome or Not
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return originalNumber == reverse;
    }

    // Given Number is Leap Year or Not
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Given Number is Armstrong Number or Not
    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int result = 0;
        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, 3);
            number /= 10;
        }
        return result == originalNumber;
    }

    // Given Number is Strong or Not
    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }
        return sum == originalNumber;
    }

    // Given Number is Perfect Number or Not
    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    // Swapping of 2 numbers without using 3rd Number
    public static int[] swapNumbers(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        return new int[]{a, b};
    }

    // Harshad Number Program
    public static boolean isHarshadNumber(int number) {
        int sum = 0;
        int originalNumber = number;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return originalNumber % sum == 0;
    }

    // Program to Check Whether a Given Number is Even or Odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Reversing of Numbers
    public static int reverseNumber(int number) {
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return reverse;
    }

    // Program to Convert Decimal to Binary
    public static String decimalToBinary(int number) {
        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            binary.insert(0, number % 2);
            number /= 2;
        }
        return binary.toString();
    }
}
