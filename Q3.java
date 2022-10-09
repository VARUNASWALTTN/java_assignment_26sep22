import java.util.Scanner;

public class Q3{
    public static void main(String[] args){
//        calculate cal = new calculate();
        Double r,a,cir;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("options:\n1 - area of circle \n2 - circumference of circle\n3 - " +
                "to exit the panel\nChoose an option (1-3): ");
        r = sc.nextDouble();
        while(true) {
            c = sc.nextInt();
            switch (c) {
                case 1:
                    a = area(r);
                    System.out.println("Area : " + a);
                    break;
                case 2:
                    cir = circumference(r);
                    System.out.println("Circumference : " + cir);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
    static Double area(Double r){
        return 3.14*r*r;
    }
    static Double circumference(Double r){
        return 2*3.14*r;
    }
}