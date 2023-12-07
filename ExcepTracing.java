class ExcepTracing{
    static void exc1() throws RuntimeException{
        try{
            System.out.println("inside exc1.");
            throw new RuntimeException();
        }
        catch(RuntimeException r){
            exc2();
        }
    }
    static void exc2() throws RuntimeException{
        try{
            System.out.println("Inside exc2.");
            throw new RuntimeException();
        }
        catch(RuntimeException r){
            System.out.println("Exception caught inside exc2 method and thrown again");
            throw r;
        }
    }
    public static void main(String[] args){
        try{
            exc1();
        }
        catch(RuntimeException r){
            r.printStackTrace();
        }
    }
}