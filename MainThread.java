class MainThread{
    public static void main(String[] args){
        Thread t = Thread.currentThread();
        System.out.println("Current Thread: " + t);
        t.setName("Main Thread");
        System.out.println("Thread renamed to: " + t);
    }
}