public class Ex8 {
    public static void main(String[] args) {
        int year=2024;
        String leapYear =(year%4==0 && year%100!=0)?(year+" It's a leap year " ): (year+" it's not a leap year");
        System.out.println(leapYear);
    }
    
}
// public class LeapYear {
//     public static void main(String[] args) {
//         int year = 2024; // Example year

//         boolean isLeap = false;

//         if (year % 4 == 0) {
//             if (year % 100 == 0) {
//                 if (year % 400 == 0) {
//                     isLeap = true;
//                 }
//             } else {
//                 isLeap = true;
//             }
//         }

//         if (isLeap) {
//             System.out.println(year + " is a leap year.");
//         } else {
//             System.out.println(year + " is not a leap year.");
//         }
//     }
// }
