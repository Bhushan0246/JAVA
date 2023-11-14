import java.util.Scanner;
class StringComparision{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two strings: ");
        String one = sc.next();
        String two = sc.next();
        System.out.println("Is equal (.equals): " + one.equals(two));
        System.out.println("Is equal (.equalsIgnoreCase): " + one.equalsIgnoreCase(two));
    }
}
