import java.util.*;
public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
      System.out.println( " Enter the number to genrate it's factorinal : ");
        int n=scanner.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
           
            fact=fact*i;
          

        }  System.out.println("The factorial of "+n+"! = "+fact);
    }
    
}
/*public class Factorial {
    public static void main(String[] args) {
        int number = 5; // Example number
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is " + factorial);
    }
}
 */