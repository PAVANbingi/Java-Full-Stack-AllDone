import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class InputsOutputs {
    public static void main(String[] args) {
        System.out.println("lets perform input and out put in this program....");
        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter you userId:");
            int userId=scanner.nextInt();
            scanner.nextLine();//consume line

            System.out.println("Enter you name:");
            String userName=scanner.nextLine();
            System.out.println("Enter you Age: ");
            int userAge=scanner.nextInt();
            System.out.println("Is the user Active (true/false):");
            boolean isActive=scanner.nextBoolean();
            System.out.println("Enter you gender(M/F):");
            char gender=scanner.next().charAt(0);
            System.err.println("Enter your current Balance $");
            double currentBalance=scanner.nextDouble();
            //
            // Output user information using System.out
            System.out.println("User Information:");
            System.out.println("User ID: " + userId);
            System.out.println("Name: " + userName);
            System.out.println("Age: " + userAge);
            System.out.println("Active: " + (isActive ? "Yes" : "No"));
            System.out.println("Gender: " + gender);
            System.out.println("Balance: $" + currentBalance);
            System.out.println("----------------------------\n");
        

        //now lets write the user information to a file by using PrintWriter

        // PrintWriter
       try( PrintWriter writer=new PrintWriter(new FileWriter("UserProfile.txt"))){
        writer.println("Hi iam pavan kumar giving the user inforamtion :");
        writer.println("User Information:");
        writer.println("User ID: " + userId);
        writer.println("Name: " + userName);
        writer.println("Age: " + userAge);
        writer.println("Active: " + (isActive ? "Yes" : "No"));
        writer.println("Balance: $" + currentBalance);
        writer.println("Gender: " + gender);
        System.out.println("----------------------------\n");
        System.out.println("User Information has been succesfully written in the file ");


       }
       catch (IOException e){
        e.printStackTrace();
       }

    //    now lets read the information writeen from the file :userprofile.txt
    System.out.println("Reading User Information from User_profile.txt :");
      try( BufferedReader reader=new BufferedReader(new FileReader("UserProfile.txt"))){
        String line;
        while((line=reader.readLine())!=null){
            System.out.println(line);
        }

      }
      catch(IOException e){
        e.printStackTrace();
      }
      System.out.println("----------------------------\n");



    }
    
}
