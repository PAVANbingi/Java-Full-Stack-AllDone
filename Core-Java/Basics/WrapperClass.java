import java.util.ArrayList;

// Wrapper classes in Java are used to convert primitive data types into objects. 
// This is useful when working with collections that can only store objects or when using methods that require objects.
// Collections in Java only work with objects, so primitive data types must be converted into their corresponding wrapper classes.

/*
 Practical Applications of Wrapper Classes:
 • Enterprise Applications: Handle data manipulation, processing, and storage.
 • Web Applications: Work with data received from client requests or retrieved from databases.
 • Mobile Applications: Manage data and interact with external services and APIs.
 • Data Processing Systems: Efficient data handling and manipulation in systems dealing with large volumes of data or complex data structures.
*/

public class WrapperClass {
    public static void main(String[] args) {
        // Primitive data types
        int pkInt = 5;
        double pkDouble = 23.00;
        char pkChar = 'k';

        // Converting primitive to wrapper objects (Boxing)
        Integer vkInt = Integer.valueOf(pkInt);
        Double vkDouble = Double.valueOf(pkDouble);
        Character vkChar = Character.valueOf(pkChar);

        // Printing boxed wrapper objects
        System.out.println("Boxed Integer: " + vkInt);
        System.out.println("Boxed Double: " + vkDouble);
        System.out.println("Boxed Character: " + vkChar);

        // Converting wrapper objects to primitives (Unboxing)
        int unboxInt = vkInt.intValue();
        double unboxDouble = vkDouble.doubleValue();
        char unboxChar = vkChar.charValue();

        // Printing unboxed primitive values
        System.out.println("Unboxed Integer: " + unboxInt);
        System.out.println("Unboxed Double: " + unboxDouble);
        System.out.println("Unboxed Character: " + unboxChar);

        // Performing autoboxing (primitive to wrapper object)
        Integer autoBoxedInt = pkInt;

        // Performing auto-unboxing (wrapper object to primitive)
        int autoUnboxedInt = vkInt;

        // Printing autoboxed and auto-unboxed values
        System.out.println("Autoboxed Integer: " + autoBoxedInt);
        System.out.println("Autounboxed Integer: " + autoUnboxedInt);

        // Using wrapper classes in collections
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(pkInt); // Autoboxing
        intList.add(10);    // Autoboxing

        // Parsing a String to an int using a wrapper class method
        String strNum = "123";
        int parsedInt = Integer.parseInt(strNum);
        System.out.println("Parsed Integer: " + parsedInt);
    }
}
