import java.util.Scanner;
class PalindromeString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String str = sc.nextLine();
        String rev = "";
        for(int i = str.length()-1; i >= 0; i--){
            rev += str.charAt(i);
        }
        if(rev.equals(str))
            System.out.println("Palindrome string!");
        else
            System.out.println("Not a Palindrome string.");
    }
}