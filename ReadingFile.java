import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
class ReadingFile{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        FileInputStream fin;
        int i = 0;
        System.out.print("Enter file name to read: ");
        String name = sc.next();
            fin = new FileInputStream(name);
        do{
            i = fin.read();
            if(i != -1)
                System.out.print((char)i);
        }while(i != -1);
        fin.close();
    }
}