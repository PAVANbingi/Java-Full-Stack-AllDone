
public class Ex15 {
    public static void main(String[] args) {
        int number = 1234; // Example number
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed Number: " + reverse);
    }
}
