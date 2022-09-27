import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s="";
        while(true){
            String temp;
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER XDONE TO EXIT\n");
            temp = sc.nextLine();
           //     System.out.println(temp);
            String exit = "XDONE";
            if(temp.equals(exit))
                break;
            s+=temp+" ";
        }
        System.out.println(s);
    }
}