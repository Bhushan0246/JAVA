class Person{
    String fName, contact;
    int age;
    Person(String n, int a, String cont){
        fName = n;
        contact = cont;
        age = a;
    }
    void display(){
        System.out.println("Name: "+fName+"\tAge: "+age);
        System.out.print("Contact: " + contact);
    }
}
abstract class Employee extends Person{
    String empNo, field;
    int experience;
    Employee(String n, int a, String cont, String eN, String fld, int exp){
        super(n, a, cont);
        empNo = eN;
        field = fld;
        experience = exp;
    }
    void display(){
        super.display();
        System.out.println(" \tEmployee No.: "+empNo);
        System.out.println("Field: "+field+"\tExperience: "+experience+" yrs");
    }
    abstract void profDetail();
}
class Profession extends Employee{
    String position;
    double salary;
    Profession(String n, int a, String cont, String eN, String fld, int exp, String pos, double sal){
        super(n, a, cont, eN, fld, exp);
        position = pos;
        salary = sal;
    }
    void profDetail(){
        super.display();
        System.out.println("Position: "+position+"\tSalary: "+salary+"/-");
        for(int i=0; i<45; i++)
            System.out.print("-");
        System.out.println("");
    }
}
class TestEmployee{
    public static void main(String[] args){
        Profession emp1 = new Profession("Bhushan Harode", 19, "9424***699", "ANLMG490326", "Production", 2, "Analysis", 78050.52);
        emp1.profDetail();
    }
}