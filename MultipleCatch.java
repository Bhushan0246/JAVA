class MultipleCatch{
    public static void main(String[] args){
        try{
            int a = args.length;
            System.out.println("Args length: " + a);
            int b = (a+5)/a;
            char c[] = new char[5];
            c[10] = 55;
        }
        catch(ArithmeticException a){
            System.err.println(a);
        }
        catch(ArrayIndexOutOfBoundsException i){
            System.err.println(i);
        }
    }
}