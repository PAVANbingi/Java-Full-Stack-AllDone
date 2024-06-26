// Palindrome
import java.util.Scanner;
public class Ex7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number that need to check whether it is a fibonacciseries or not ");
        int num=sc.nextInt();
        int c=num;
        int r,s=0;
        while(num>0){
            r=num%10;
            s=s*10+r;
            num=num/10;
        }
        if(c==s){
            System.out.println(c+" it's a palindrome");
        }
        else
        System.out.println("sorry it's not a palindrome: "+c);

    }
}
/*public class Palindrome {
    public static void main(String[] args) {
        int number = 121; // Example number
        int originalNumber = number;
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        if (originalNumber == reverse) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
}
 */