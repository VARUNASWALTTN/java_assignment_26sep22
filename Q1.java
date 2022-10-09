public class Q1 {
    static String first_name = "varun",last_name = "aswal";
    static int age = 22;
    static{
        System.out.println("This is "+first_name+" "+last_name+". And my age is "+age+".");
    }
    private static void func(){
        System.out.println("This is "+first_name+" "+last_name+". And my age is "+age+".");
    }
    public static void main(String[] args) {
        func();
        System.out.println("This is "+first_name+" "+last_name+". And my age is "+age+".");
    }
}