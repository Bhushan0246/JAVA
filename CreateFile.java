import java.io.File;
import java.io.IOException;
import java.util.Scanner;
class CreateFile{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the path of file followed by its name.extension : ");
        String path = sc.nextLine();
        try{
            File fl = new File(path);
            if(fl.createNewFile())
                System.out.println("File " + fl.getAbsolutePath() + " created successfully.");
            else
                System.out.println("The file already exist in directory.");
        }
        catch(IOException e){
            System.err.println("An unexpected error occured.");
            e.printStackTrace();
        }
    }
}