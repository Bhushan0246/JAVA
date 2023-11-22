import java.util.Scanner;
class TrimName{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String name = sc.nextLine();
    //trim for leading spaces
        name = name.trim();
    //split name on spaces
        String[] words = name.split(" ", 0);
        String newName = "", temp = "";
    //Storing first letter of each word
        for(int i=0; i<words.length; i++){
            temp = words[i].substring(0, 1);
            newName += temp + ".";
        }
    //Printing newName
        System.out.println("Trimmed name: " + newName.toUpperCase());

    }
}