import java.util.Scanner;
class ATM{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pin = 8584, tries = 3;
		float balance = 50000, deposit, withdraw;
		while(tries != 0){
			System.out.print("Enter your 4-digit PIN: ");
			int tempPin = sc.nextInt();
			if(tempPin == pin){
				System.out.println("Access Granted!");
				strike();	
				while(true){
					System.out.printf("Choose 1 for Withdraw\nChoose 2 for Deposit\nChoose 3 for Balance Enquiry\nChoose 4 for Exit\n");
					System.out.print("\nEnter your choice number: ");
					int choice = sc.nextInt();
					strike();
					switch(choice){
					case 1:
						System.out.println("Available balance: " + balance);
						System.out.print("Enter the amount to withdraw: ");
						withdraw = sc.nextFloat();
						if(balance >= withdraw){
							balance -= withdraw;
							System.out.println("Please collect your Cash.");
						}
						else
							System.out.println("Insufficient Balance!");
						strike();
						break;
					case 2:
						System.out.println("Enter the amount to deposit: ");
						deposit = sc.nextFloat();
						balance += deposit;
						System.out.println("Updated balance: " + balance);
						strike();
						break;
					case 3:
						System.out.println("Available balance: " + balance);
						strike();
						break;
					case 4:
						System.out.println("Thanks!\nVisit again.");
						System.exit(0);
					default:
						System.out.println("Invalid Choice!");
					}
				}
			}
			else
				System.out.println("Invalid PIN.\nTry Again!\n");
			tries--;
		}
	}
	public static void strike(){
		for (int i = 0; i < 45; i++)
			System.out.print("--");
		System.out.println("");
	}
}