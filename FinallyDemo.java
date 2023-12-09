class FinallyDemo{
    static void excA(){
        try{
            System.out.println("Inside excA()");
            throw new RuntimeException();
        }
        finally{
            System.out.println("Inside excA's method finally block.");
        }
    }
    static void excB(){
        try{
        System.out.println("Inside excB()");
        }
        finally{
            System.out.println("excA's family");
        }
    }
    public static void main(String[] args){
        try{
            excA();
        }
        catch(RuntimeException r){
            System.out.println("Exception caught inside main()\nDescription: " + r);
        }
    }
}