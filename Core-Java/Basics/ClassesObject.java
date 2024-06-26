class Account{
    //attributes
    int userid;
    String username;
    int age;
    double balance;

    //constructor
    public Account(int userid,String username,int age,double balance){
        this.userid=userid;
        this.username=username;
        this.age=age;
        this.balance=balance;
    }
    // method
    public void show(){
        System.out.println(" Hello!  "+username+" "+"your userId :"+userid+" having current balance :"+balance);
    }

}
public class ClassesObject {
    public static void main(String pk[]){
        Account user1=new Account(6601,"Pavankumar",66,98934.00 );
        user1.show();


    }

    
}
