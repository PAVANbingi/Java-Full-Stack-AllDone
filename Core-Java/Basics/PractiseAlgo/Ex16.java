
public class Ex16 {
    public static void main(String[] args) {
        int number = 10; // Example decimal number
        String binary = "";

        while (number > 0) {
            binary = (number % 2) + binary;
            number /= 2;
        }

        System.out.println("Binary: " + binary);
    }
}
