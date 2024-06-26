package OOPS;

public class User implements UserOperations{
    private int userId;
   private String userNmae;
   private String email;
   private int age;
   private double balance;

public User(int userId,String userName,String email,int age,double balance){
    this.userId=userId;
    this.userNmae=userName;
    this.email=email;
    this.age=age;
    this.balance=balance;
}

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserNmae() {
        return userNmae;
    }

    public void setUserNmae(String userNmae) {
        this.userNmae = userNmae;
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
    public void displayUserInfo(){
        System.out.println("user Id : "+userId);
        
        System.out.println("user Name : "+userNmae);
        
        System.out.println("user email : "+email);
        
        System.out.println("user age : "+age);
        
        System.out.println("user balance : "+balance);
    }

    @Override
    public void updateUserBalance(double amount) {
        this.balance +=amount;
        System.out.println("updated Balance:"+this.balance);
        // TODO Auto-generated method stub
        
    }
    
    
}
