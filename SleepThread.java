class SleepThread{
    public static void main(String[] args){
        try{
            for(int i=0; i<5; i++){
                for(int j=0; j<=i; j++){
                    System.out.print("* ");
                    Thread.sleep(300);
                }
                System.out.println("");
            }
        }
            catch(Exception e){
                System.err.println("Main thread interupted.");
            }
    }
}