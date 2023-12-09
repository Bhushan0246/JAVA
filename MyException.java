class MyException extends Exception{
    int a;
    MyException(int a){
        this.a = a;
    }
    public String toString(){
        return "MyException [" + a +"]";
    }
}
class ExceptionDemo{
    static void compute(int a) throws MyException{
        System.out.println("Called compute(" + a + ")");
        if (a<10)
            throw new MyException(a);
        System.out.println("Normal Exit");
    }
    public static void main(String[] args){
        try{
            compute(3);
            compute(12);
        }
        catch(MyException m){
            System.err.println("Caught " + m);
        }
    }
}