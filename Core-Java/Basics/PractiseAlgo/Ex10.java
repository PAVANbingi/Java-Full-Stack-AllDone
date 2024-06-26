public class Ex10 {
       public static void main(String[] args) {
        int number = 145; // Example number
        int originalNumber = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is a strong number.");
        } else {
            System.out.println(originalNumber + " is not a strong number.");
        }
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
// public class StrongNumber {
//     public static void main(String[] args) {
//         int number = 145; // Example number
//         int originalNumber = number;
//         int sum = 0;

//         while (number != 0) {
//             int digit = number % 10;
//             sum += factorial(digit);
//             number /= 10;
//         }

//         if (sum == originalNumber) {
//             System.out.println(originalNumber + " is a strong number.");
//         } else {
//             System.out.println(originalNumber + " is not a strong number.");
//         }
//     }

//     public static int factorial(int n) {
//         int result = 1;
//         for (int i = 1; i <= n; i++) {
//             result *= i;
//         }
//         return result;
//     }
// }
