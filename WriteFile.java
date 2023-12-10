import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class WriteFile{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fname = sc.nextLine();
        FileWriter fWrite;
        System.out.print("Do you want to overwrite file (yes or no) ? ");
        String mod = sc.next();
        try{
            if(mod.equalsIgnoreCase("no"))
                fWrite = new FileWriter(fname, true);
            else
                fWrite = new FileWriter(fname);
            fWrite.write("Hello! Bhushan Harode \nWelcome to JAVA Programming.\n");
            fWrite.close();
            System.out.println("File wrote successfully.");
        }
        catch(IOException e){
            System.out.println("An unexpected error occured.");
            System.err.println(e);
        }
    }
}