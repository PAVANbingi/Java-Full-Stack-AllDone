
public class Ex13 {
    public static void main(String[] args) {
        int number = 18; // Example number
        int sum = 0;
        int originalNumber = number;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad number.");
        }
    }
}
