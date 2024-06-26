// Stream conveys elements from a source, such as a data structure, an array, a generator function, or an I/O channel, through a pipeline of computational operations. It's functional in nature, and an operation on a stream produces a result but doesn't modify its source
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class StreamEx {

    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        
        // Filtering logic n%2 == 0 even numbers
        List<Integer> evennumbers= numbers.stream()
                                    .filter(n -> n%2 == 0)
                                    .collect(Collectors.toList());

       System.out.println("Even Numbers:"+evennumbers);
    //    Mapping n*n
    List<Integer> SquareNumbers=numbers.stream()
                                        .map(n -> n*n)
                                        .collect(Collectors.toList());
        System.out.println("squared Numbers :"+SquareNumbers);
        
        // Summing all numbers 
        int sum=numbers.stream()
                        .reduce(0,Integer ::sum);
        System.out.println("sum of number"+sum);
        // Counting even numbers
        long countEvenNumbers = numbers.stream()
                                       .filter(n -> n % 2 == 0)
                                       .count();
        System.out.println("Count of Even Numbers: " + countEvenNumbers);

        // Finding the maximum number
        int maxNumber = numbers.stream()
                               .max(Integer::compareTo)
                               .orElseThrow(NoSuchElementException::new);
        System.out.println("Maximum Number: " + maxNumber);

        // Finding the minimum number
        int minNumber = numbers.stream()
                               .min(Integer::compareTo)
                               .orElseThrow(NoSuchElementException::new);
        System.out.println("Minimum Number: " + minNumber);

        // Creating a list of strings
        List<String> words = Arrays.asList("Java", "Stream", "API", "Example");

        // Filtering words that start with 'J'
        List<String> wordsStartingWithJ = words.stream()
                                               .filter(w -> w.startsWith("J"))
                                               .collect(Collectors.toList());
        System.out.println("Words starting with 'J': " + wordsStartingWithJ);

        // Joining strings with a comma
        String joinedString = words.stream()
                                   .collect(Collectors.joining(", "));
        System.out.println("Joined String: " + joinedString);
   
   
   
    }
    
}
