import java.util.*;
public class Q3
{
    public static void main(String[] args) {
        int option;
        double r, cir, a;
        System.out.println("enter the radius");

        Scanner sc = new Scanner(System.in);

        r = sc.nextDouble();
        System.out.println("options:\n1 - area of circle \n2 - circumference of circle\n3 - to exit the panel");
        while (true) {
            option = sc.nextInt();
            switch (option) {
                case 1:
                    a = area(r);
                    System.out.println("area:" + a);
                    break;
                case 2:
                    cir = circum(r);
                    System.out.println("circumference " + cir);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid");
                    break;
            }
        }

    }

    static Double area(Double r){
        return 3.14*r*r;
    }
    static Double circum(Double r){
        return 2*3.14*r;
    }
}