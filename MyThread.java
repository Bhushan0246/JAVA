class MyThreadA extends Thread{
    public void run(){
        System.out.println("Running MyThread_A");
        for(int i=0; i<5; i++){
            System.out.println("A: " + i + 11);
        }
        System.out.println("Exit from MyThread_A");
    }
}
class MyThreadB extends Thread{
    public void run(){
        System.out.println("Running MyThread_B");
        for(int i=0; i<5; i++){
            System.out.println("B: " + i + i);
        }
        System.out.println("Exit from MyThread_B");
    }
}
class MyThreadC extends Thread{
    public void run(){
        System.out.println("Running MyThread_C");
        for(int i=0; i<5; i++){
            System.out.println("C: " + i + 90);
        }
        System.out.println("Exit from MyThread_C");
    }
}
class TestThreads{
    public static void main(String[] args){
        new MyThreadA().start();
        new MyThreadB().start();
        new MyThreadC().start();
        System.out.println("End of main thread");
    }
}