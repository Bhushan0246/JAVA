class Throws_Demo{
    void exc() throws SecurityException{
        try{
            throw new SecurityException("Insecure");
        }
        catch(SecurityException s){
            System.err.println("Exception caught in exc().");
            throw s;
        }
    }
    public static void main(String[] args){
        Throws_Demo er = new Throws_Demo();
        try{
        er.exc();
        }
        catch(SecurityException s){
            System.err.println("Exception " + s + " recaught in main().");
        }
    }
}