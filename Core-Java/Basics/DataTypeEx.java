import java.util.Scanner;
public class UserInfo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Here we are using dataTypes to store the data efficent and to utilize this memory in effective way");

        /**
         * 
         *  Explanation
byte age: The byte type is used for the user's age since it ranges from -128 to 127, which is sufficient for age.
short yearJoined: The short type is used for the year the user joined, ranging from -32,768 to 32,767.
int userId: The int type is used for the user's ID, a larger range is required.
long phoneNumber: The long type is used for the user's phone number, allowing for a large number of digits.
float accountBalance: The float type is used for the account balance, suitable for decimal values.
double height: The double type is used for the user's height, which also involves decimal values and requires higher precision.
char gender: The char type is used for the gender, representing a single character.
boolean isActiveMember: The boolean type is used to represent whether the user is an active member or not.
         */
        //Basic info
        byte age =25;
        short yearJoined=2017;
        int userId=45312437;
        long phoneNumber=345234245;
        //Finical info
        float accountBalance=123232.23f;
        double weight_Gold=32.55;
        //Peresonal attribute
        char Gender='M';
        boolean isActiveMember=true;
        //Now Let's display those infromation 
        System.out.println("User Infomation :");
        System.out.println("Age: " + age);
        System.out.println("Year Joined: " + yearJoined);
        System.out.println("User ID: " + userId);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Account Balance: $" + accountBalance);
        System.out.println("Height: " + weight_Gold + " meters");
        System.out.println("Gender: " + Gender);
        System.out.println("Active Member: " + isActiveMember);

    }
}