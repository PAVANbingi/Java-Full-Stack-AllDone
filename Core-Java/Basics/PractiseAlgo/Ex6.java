public class Ex6 {
    public static void main(String[] args) {
        
        int n=99;
        int sum=0;int r;
        while(n>0){
            r=n%10;//retrive digits
            sum=sum+r;
            n=n/10;//gives the single number from it self same number 
            

        }
        System.out.println("The sum of  this (99) digits :"+sum);
    }
    
}

// public class SumOfDigits {
//     public static void main(String[] args) {
//         int number = 1234; // Example number
//         int sum = 0;

//         while (number != 0) {
//             sum += number % 10;
//             number = number / 10;
//         }

//         System.out.println("Sum of digits: " + sum);
//     }
// }
