import java.util.Scanner;
class StringOperation1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str1 = sc.nextLine();
        System.out.println("Length of string: " + str1.length());
        System.out.println("String in upper case: " + str1.toUpperCase());
        System.out.println("String in lower case: " + str1.toLowerCase());
    }
}