public class BankAccount{
int accountNumber;
double accountBalance;
BankAccount(){
    accountBalance = 10540;
    accountNumber = 12398703;
}
// to withdraw funds from the account
public synchronized boolean transfer (double amount){
double newAccountBalance;
if( amount > accountBalance){ //there are not enough funds in the account
return false;
}
else{ 
    newAccountBalance = accountBalance - amount;
    accountBalance = newAccountBalance; 
    return true; 
}
}
//Synchronized keyword in Java

public synchronized boolean deposit(double amount)
{
double newAccountBalance;
if( amount < 0.0){
     return false; // can not deposit a negative amount
}
else{
newAccountBalance = accountBalance + amount;
accountBalance = newAccountBalance;
return true;
}
}
}
