import java.util.Scanner;
class Reverse_String{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String str = sc.nextLine();
        String rev = "";
        for(int i = str.length()-1; i>=0; i--)
            rev += str.charAt(i);
        System.out.println("Reversed string: " + rev);
    }
}