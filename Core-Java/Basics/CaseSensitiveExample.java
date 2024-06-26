public class CaseSensitiveExample {
    public static void main(String[] args) {
        int myVariable = 10;
        int MyVariable = 20;
        int MYVARIABLE = 30;

        System.out.println("myVariable: " + myVariable);
        System.out.println("MyVariable: " + MyVariable);
        System.out.println("MYVARIABLE: " + MYVARIABLE);
    }
}
