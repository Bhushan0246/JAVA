import java.util.Scanner;
class Reverse_String{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] temp = new char[str.length()];
        str.getChars(0, str.length(), temp, 0);
        char[] dest = new char[str.length()];
        for(int i=0; i<temp.length; i++)    //reverse string and store in dest[]
            dest[temp.length-i-1] = temp[i];
        String tempString = new String(dest); //convert char[] to string
        System.out.println("Reversed string: "+tempString);
    }
}