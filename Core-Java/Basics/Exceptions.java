public class Exceptions {
    public static void main(String[] args) {

        try {
            
            int a=10/0;
            System.out.println(a);
            
            
        } catch (Exception e) {
            System.out.println("you can't delete the number with zero ");
        }
        finally{
            System.out.println("try to delete with other number");
        }
        

        }
    }
    

