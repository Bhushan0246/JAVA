import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
class OutputStream{
    public static void main(String[] args) throws IOException{
        FileOutputStream fout;
        try{
            fout = new FileOutputStream("newDoc.txt");
        }
        catch(FileNotFoundException e){
            System.out.println("Error occured while opening file.");
            return;
        }
        try{
            for(int i = 0; i<10; i++){
                fout.write(i+65);
                fout.write(32);
            }
        }
        catch(IOException io){
            System.out.println(io);
        }
        fout.close();
    }
}