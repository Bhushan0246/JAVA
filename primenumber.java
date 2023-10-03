import java.util.Scanner;
class primeNumber{
    public static void main(String args[]){
        Scanner abc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int a=abc.nextInt();
        int half=a/2;
        int res=1;
        for(int i=2;i<=half; i++){
            res=a%i;
            if(res==0){
                System.out.print("Not a prime number.");
                break;
            }
        }
        if(res ==1)
        System.out.println("Prime nummber.");
    }
}