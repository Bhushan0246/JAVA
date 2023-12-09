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