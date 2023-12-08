class TestBankAccount{
    public static void main(String[] args){
        BankAccount acc = new BankAccount();
        System.out.println(acc.transfer(1000)+" Balance: " + acc.accountBalance);
        System.out.println(acc.deposit(400) + " Balance: " + acc.accountBalance);
    }
}