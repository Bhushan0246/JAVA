import java.io.File;
import java.io.IOException;
import java.util.Scanner;
class FileHandling{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String name = sc.nextLine();
        File fl = new File(name);
        System.out.println("Readable: " + fl.canRead());
        System.out.println("Writable: " + fl.canWrite());
        System.out.println("Length: " + fl.length());
        System.out.println("Absolute path: " + fl.getAbsolutePath());
    }
}