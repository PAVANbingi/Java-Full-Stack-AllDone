import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.function.Predicate;

// Functional interface for mathematical operations
interface MathOperation {
    int operate(int a, int b);
}

// Functional interface for string operations
interface StringOperation {
    String operate(String s1, String s2);
}

public class LambdaExpressionExample {

    public static void main(String[] args) {
        // Example 1: Basic lambda expression
        MathOperation addition = (a, b) -> a + b;
        System.out.println("Addition Result: " + operate(10, 5, addition));

        // Example 2: Lambda expression with multiple statements
        MathOperation subtraction = (a, b) -> {
            int result = a - b;
            return result;
        };
        System.out.println("Subtraction Result: " + operate(10, 5, subtraction));

        // Example 3: Lambda expression as method parameter
        StringOperation concat = (s1, s2) -> s1 + " " + s2;
        System.out.println("Concatenated String: " + operate("Hello", "World", concat));

        // Example 4: Using predefined functional interfaces (Predicate)
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = filter(numbers, n -> n % 2 == 0);
        System.out.println("Even Numbers: " + evenNumbers);
    }

    // Method that accepts a lambda expression as a parameter for MathOperation
    private static int operate(int a, int b, MathOperation operation) {
        return operation.operate(a, b);
    }

    // Method that accepts a lambda expression as a parameter for StringOperation
    private static String operate(String s1, String s2, StringOperation operation) {
        return operation.operate(s1, s2);
    }

    // Method that uses a predefined functional interface (Predicate)
    private static List<Integer> filter(List<Integer> numbers, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (predicate.test(number)) {
                result.add(number);
            }
        }
        return result;
    }
}
