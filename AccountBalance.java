package pack1;
public class Balance{
    double bal;
    String name;
    Balance(String n, Double b){
        this.name = n;
        this.bal = b;
    }
    public void display(){
        System.out.print("Name: " + name + "\t");
        System.out.println("Balance: " + bal);
        if(bal <= 0)
            System.out.println("Low Balance!");
    }
}
class AccountBalance{
    public static void main(String[] args){
        Balance acc1 = new Balance("Bhushan Harode", 14001.0);
        Balance acc2 = new Balance("Ayush Patidar", 8040.54);
        acc1.display();
        acc2.display();
    }
}
