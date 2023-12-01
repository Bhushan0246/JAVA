class Person{
    String name, fname;
    int age;
    Person(String n, String fn, int a){
        name = n;
        fname = fn;
        age = a;
    }
    void display(){
        System.out.print("Name: " + name + "\tFather name: "+ fname + "\nAge: " + age);
    }
}
class Student extends Person{
    double percent;
    int roll;
    Student(String n, String fn, int a, double per, int rl){
        super(n, fn, a);
        percent = per;
        roll = rl;
    }
    void display(){
        super.display();
        System.out.print(" \tRoll no.: " + roll + "\nPercent: " + percent);
    }
    String result(){
        if(percent >= 90)
            return "O";
        else if(percent < 90 || percent >= 80)
            return "A+";
        else if(percent < 80 || percent >= 70)
            return "A";
        else if(percent < 70 || percent >= 60)
            return "B";
        else if(percent < 60 || percent >= 45)
            return "C";
        else
            return "F";
    }
}
class Course extends Student{
    String program;
    int duration;
    Course(String n, String fn, int a, double per, int rl, String pro, int d){
        super(n, fn, a, per, rl);
        program = pro;
        duration = d;
    }
    void display(){
        super.display();
        System.out.print(" \tProgram: " + program + "\nDuration: " + duration);
        System.out.println(" \tGrade: " + result());
        // Strike line
        for(int i=0; i<40; i++)
            System.out.print("-");
        System.out.println("");
    }
}
class TestPerson{
    public static void main(String[] args){
        Course man1 = new Course("Bhushan", "Harode", 19, 84.55, 202204, "BSc", 4);
        man1.display();
        Course man2 = new Course("Ayush", "Patidar", 20, 85, 202201, "I.Mtech", 5);
        man2.display();
    }
}