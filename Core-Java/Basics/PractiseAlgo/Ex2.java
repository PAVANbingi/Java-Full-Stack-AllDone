/*public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Number of terms
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: " + a + " " + b);

        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
    }
}
 */
public class Ex2 {
    public static void main(String[] args) {
        int a=0,b=1,c;
       int n=10;//upto range 0 1 1 .....
       System.out.print("The fibonacci serie for "+n+" th term is : ");
        for(int i=1;i<=n;i++){
            System.out.print(a+"\t");
            c=a+b;
            a=b;
            b=c;

            

        }
    }
}
 