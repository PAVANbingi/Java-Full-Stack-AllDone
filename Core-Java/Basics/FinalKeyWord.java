

class User{
    private String userName;

    public User(String userName){
        this.userName=userName;
    }
    public String getUserName(){
        return userName;
    }
    final void show(){
        System.out.println("User Name :"+ getUserName());
    }

}
class AdminUser extends User{

    public AdminUser(String userName) {
        super(userName);
        //TODO Auto-generated constructor stub
    }
  
   

    }
    final class Constants{
        public static final String applicationName="user_form";
       
        
    }







public class FinalKeyWord {
    public static void main(String[] args) {
        final  int maxUsers=100;
        // maxUsers=101;// yes we can't assign once anything is final it will become immutable
        System.out.println("The maximum number of users is :"+maxUsers);
        User pk=new User("vinay");
        pk.show();
        AdminUser vk=new AdminUser("VinayKumar");
        vk.show();
  

    }
    
}
