public class Ex9 {
    public static void main(String args[]){
        int n=153;
        int c=n;
        int s=0;
        while(n>0){
            int r=n%10;
            s+=Math.pow(r,3);
            n=n/10;


        }
        if(c==n){
            System.out.println(c+" It's a ArmstrongNumber ");
        }
        else{
            System.out.println(c+" It's not a Armstrong number");
        }
    }
    
}

// public class ArmstrongNumber {
//     public static void main(String[] args) {
//         int number = 153; // Example number
//         int originalNumber = number;
//         int result = 0;

//         while (number != 0) {
//             int digit = number % 10;
//             result += Math.pow(digit, 3);
//             number /= 10;
//         }

//         if (result == originalNumber) {
//             System.out.println(originalNumber + " is an Armstrong number.");
//         } else {
//             System.out.println(originalNumber + " is not an Armstrong number.");
//         }
//     }
// }
