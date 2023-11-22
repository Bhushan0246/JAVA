import java.util.Scanner;
class Word_Count{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        char[] ch = new char[str.length()];
        int count = 1;
        String temp = "";
        str.getChars(0, str.length(), ch, 0);
        for(int i=0; i<ch.length; i++){
            temp = String.valueOf(ch[i]);
            if(temp.equals("\s"))
                count++;
        }
        System.out.println("Length of string: " + str.length());
        System.out.print("Number of words: " + count);
    }
}