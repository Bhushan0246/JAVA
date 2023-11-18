import java.util.Scanner;
public class StringOperation2 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a String: ");
    String str1 = sc.nextLine();
    // Returns unicode value of a character at index no.
    System.out.println("Unicode value of first character is: " + str1.codePointAt(0));
    // Returns the index value of a character from the start_index position else -1
    System.out.println("\nOccurance of 'a' in str1 (after index 3) is at: " + str1.indexOf("a", 3));
    // Returns value greater than, less than, or equals to 0 on comparision
    System.out.print("Enter another String: ");
    String str2 = sc.nextLine();
    System.out.println("\nOn comparing str1 with str2: " + str1.compareTo(str2));
    //Returns true if string is empty
    System.out.println("Is str1 empty: " + str1.isEmpty());
    }
}