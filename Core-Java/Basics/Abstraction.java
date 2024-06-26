abstract class User {
    private int userId;
    private String userName;
    private String email;
    private int age;

    // Constructor
    public User(int userId, String userName, String email, int age) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.age = age;
    }

    // Abstract method to be implemented by subclasses
    public abstract void show();

    // Getters and Setters
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
}

// Interface for user operations
interface UserOperation {
    void updateUserEmail(String email);
    void updateUserAge(int age);
}

// RegularUser class extending User and implementing UserOperation
class RegularUser extends User implements UserOperation {
    private double balance;

    // Constructor
    public RegularUser(int userId, String userName, String email, int age, double balance) {
        super(userId, userName, email, age);
        this.balance = balance;
    }

    // Implementing interface methods
    @Override
    public void updateUserEmail(String email) {
        setEmail(email);
    }

    @Override
    public void updateUserAge(int age) {
        setAge(age);
    }

    // Implementing abstract method from User
    @Override
    public void show() {
        System.out.println(" User Id :"+getUserId()+" - "+getUserName() + " has a current balance of: $" + balance);
        System.out.println("your personal information is \n"+getEmail()+" is current email address & "+getAge()+" is presetn age in our database");
    }
}

// Main class to test the implementation
public class Abstraction {
    public static void main(String[] args) {
        RegularUser user1 = new RegularUser(6603, "PavanKumarBingi", "pkr@gmail.com", 45, 94566.00);
        user1.show();

        // Updating user information
        user1.updateUserEmail("pavan.kumar@example.com");
        user1.updateUserAge(46);
        
        // Displaying updated information
        System.out.println("Updated user information:");
        user1.show();
    }
}
