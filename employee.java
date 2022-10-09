public class employee {
    private String FirstName,LastName,Designation;
    private int age;

    public employee(){
    }
    public employee(String FirstName, String LastName, String Designation, int age){
        this.age=age;
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.Designation=Designation;
    }

    public employee(employee emp){
        this.FirstName=emp.FirstName;
        this.LastName=emp.LastName;
        this.age=emp.age;
        this.Designation=emp.Designation;

    }
    public String getFirstName(){
        return FirstName;
    }
    public String getLastName(){
        return LastName;
    }
    public int getAge(){
        return age;
    }
    public String getDesignation(){
        return Designation;
    }

    //setter
    public void setFirstName(String fname){
        FirstName=fname;
    }
    public void setLastName(String lname){
        LastName=lname;
    }
    public void setAge(int a){
        age=a;
    }
    public void setDesignation(String des){
        Designation=des;
    }
    public String toString(){
        return FirstName+" "+LastName+" "+age+" "+Designation;
    }
    public static void main(String[] args) {

        employee emp = new employee();
        System.out.println(emp.toString());
        emp = new employee("VARUN" , "ASWAL","AEM",24);
        System.out.println(emp.toString());
        employee emp1 = new employee(emp);
        System.out.println(emp1.toString());
    }
}