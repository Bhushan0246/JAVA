import java.util.Scanner;
class StringOperation3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = "   Hello!  ";
        System.out.print("Original str1:" + str1);
        // trim() removes the leading & ending whitespaces from string
        System.out.println("Trimmed str1:" + str1.trim());
        System.out.print("Enter name: ");
        String str2 = sc.nextLine();
        // concate() appends a string on another
        str1 = str1.trim() + " ";
        System.out.println("Concatanation: "str1.concat(str2));
        //Returns true if the string contains specific char/string
        System.out.println("Contains 'Hel' in str1: " + str1.contains("Hel"));
    }
}