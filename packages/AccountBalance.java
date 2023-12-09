package pack1;

import pack1.Balance;

class AccountBalance{
    public static void main(String[] args){
        Balance acc1 = new Balance("Bhushan Harode", 14001.0);
        Balance acc2 = new Balance("Ayush Patidar", 8040.54);
        acc1.display();
        acc2.display();
    }
}
