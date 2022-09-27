public class Main {

    static String FirstName = "VARUN", LastName = "ASWAL";
    static int age=25;

    public static void example(){
        System.out.println("Static method");
        System.out.println(age);
    }


        static{
            System.out.println("STATIC BLOCK");
            System.out.println(FirstName);
        }

    public static void main(String[] args) {
        System.out.println("main method");
        System.out.println(LastName);
        example();
    }
}
