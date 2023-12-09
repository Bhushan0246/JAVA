import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
class CreateFile{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.print("Enter file name: ");
        String name = sc.nextLine();
        FileInputStream fin = new FileInputStream(name);
        FileOutputStream fout = new FileOutputStream("newdoc.txt", true);
        do{
            i = fin.read();
            if(i != -1)
                fout.write(i);
        }while(i != -1);
        System.out.println("File created successfully");
        fin.close();
        fout.close();
    }
}