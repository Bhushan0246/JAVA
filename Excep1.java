class Excep1{
    public static void main(String[] args){
        int a = 4, b = 0;
        try{
        int c = a / b;
        }
        catch(ArithmeticException e){
            System.out.println("Inside catch block");
            System.err.println("Exception: " + e);
        }
        System.out.println("Rest of statements.");
    }
}