class Th implements Runnable{
    public void run(){
        System.out.println("Running thread: Th");
        for(int i = 0; i < 5; i++)
            System.out.println(i+1);
        System.out.println("Exit from thread: TH");
    }
}
class ThreadInterface{
    public static void main(String[] args){
        Th x = new Th();
        Thread xThread = new Thread(x);
        xThread.start();
    }
}