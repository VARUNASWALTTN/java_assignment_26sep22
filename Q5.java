import java.lang.*;
class employee {
    String first_name,last_name,designation;
    int age;
    public employee(){
        first_name = "Varun";
        last_name = "Aswal";
        designation = "AEM";
        age = 26;
    }
    public employee(String f, String l, String d, int a){
        this.first_name = f;
        this.last_name = l;
        this.designation = d;
        this.age = a;
    }
    public employee(employee emp){
        this.first_name = emp.first_name;
        this.last_name = emp.last_name;
        this.designation = emp.designation;
        this.age = emp.age;
    }
    void setName(String f,String l){
        this.first_name = f;
        this.last_name = l;
    }

    String getName(){
        return first_name+" "+last_name;
    }
    void setDesignation(String d){
        this.designation = d;
    }
    String getDesignation(){
        return designation;
    }

    void setAge(int a){
        this.age = a;
    }
    int getAge(){
        return age;
    }

    public String toString(){
        return "I am "+first_name+" "+last_name+".I am working as "+designation+
                ". And my age is "+age+".";
    }


}
public class Q5 {
    public static void main(String[] args){
        employee e1 = new employee();
        System.out.println("I am "+e1.getName()+".I am working as "+e1.getDesignation()+
                ". And my age is "+e1.getAge()+".");
        employee e2 = new employee("Utkarsh","Chaturvedi","AEM",24);
        System.out.println("This is "+e2.getName()+".I am working as "+e2.getDesignation()+
                ". And my age is "+e2.getAge()+".");
//        employee e3 = new employee(e2);
//       System.out.println("This is "+e3.getName()+".I am working as "+e3.getDesignation()+
//                ". And my age is "+e3.getAge()+".");
//        System.out.println(e1.toString());
//        System.out.println(e2.toString());
//        System.out.println(e3.toString());
    }
}