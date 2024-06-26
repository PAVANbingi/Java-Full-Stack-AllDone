
//encapsulation or wrapping of data and hinding some stuff


import java.util.Scanner;

class User{
   private int userId;
   private String userName;
   private String email;
   private int age;
   private double balance;

//    constructor
public User(int userId,String userName,String email,int age,double balance){
    this.userId=userId;
    this.userName=userName;
    this.email=email;
    this.age=age;
    this.balance=balance;
}
// generating getters and setters



    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    // creating a method to show all those stuff
    public void show(){
        System.out.println("+++++++++++++");
        System.out.println("Hello! "+userName+" Your userId is : "+userId+" with balance : $"+balance);
        System.out.println("+++++++++++++");
        System.err.println("Your email id is "+email+"and your given Age :"+age);
        System.out.println("+++++++++++++");
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your userId");
        int id=sc.nextInt();
        System.out.println("Enter your pin:");
        int pin=sc.nextInt();

        if (id==101 && pin==6603){
            User user1=new User(101,"pavan kumar bingi","pkr@gmal.com",22,9999.00);
            
    //    displaying user information:
        user1.show();
        // let's update user information
        user1.setUserId(102);
        user1.setAge(24);
        user1.setBalance(8393.00);
        //displaying updated
        System.out.println("\n updated user Information :");
        user1.show();}
        else{
            System.out.println("sorry you were not in our database");
        }
    }
    
}

