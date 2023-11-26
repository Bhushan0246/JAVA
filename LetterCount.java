import java.util.Scanner;
class LetterCount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String temp = "", str = sc.nextLine();
        char[] dest = new char[str.length()];
        int count = 0;
        str.getChars(0, str.length(), dest, 0);
        for(int i=0; i<dest.length; i++){
            temp = String.valueOf(dest[i]); 
            if(temp.equals(" "))
                count++;
        }
        System.out.println("Letters: " + (str.length() - count));
        System.out.println("Spaces: " + count);

    }
}