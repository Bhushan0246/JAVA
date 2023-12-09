class ThrowDemo{
    static void demoProc(){
        try{
            throw new NullPointerException();
        }
        catch(NullPointerException n){
            System.err.println("Caught inside demoProc().");
            throw n;
        }
    }
    public static void main(String[] args){
        try{
            demoProc();
        }
        catch(NullPointerException n){
            System.err.println("Recaught in main().");
        }
    }
}