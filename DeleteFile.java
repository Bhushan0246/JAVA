import java.io.File;
import java.util.Scanner;
class DeleteFile{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name to delete: ");
        String fname = sc.nextLine();
        try{
            File fl = new File(fname);
            if(fl.delete())
                System.out.println("File deletion successful.");
            else
                System.out.println("File can't be deleted.");
        }
        catch(Exception e){
            System.err.println(e);
        }
    }
}