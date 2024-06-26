import java.util.*;
public class Ex1{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number to be checked :");
        int number=scanner.nextInt();
        if (number<=1){
            System.out.println(number+" it's not a prime number");
        }
        int count=0;
        for(int i=2;i<=number;i++){
            if(number%i==0)
                count++;
        
           }
           if(count==2){
            System.out.println(number+" - is a prime number");
           }
           else {
            System.out.println(number+" - it not a prime number");
           }
}
}
/*import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to be checked:");
        int number = scanner.nextInt();
        
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        
        scanner.close();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(number); i++) { // Check divisors up to the square root of the number
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
 */