import java.util.Scanner;

public class Q2 {
        public static void main(String[] args) {
            String s="";
            System.out.println("FOR EXIT TYPE: XDONE");
            while(true){
                String temp;
                Scanner sc = new Scanner(System.in);
                temp = sc.nextLine();
                String exit = "XDONE";
                if(temp.equals(exit))
                    break;
                s+=temp+" ";
            }
            System.out.print(s);
        }
}
