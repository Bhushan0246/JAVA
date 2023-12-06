class NestedTry{
    public static void main(String[] args){
        try{
            int a = args.length;
            int b = (a + 5)/a;
            System.out.println("a = " + a);
            try{
                char ch[] = new char[5];
                ch[10] = 'f';
            }
            catch(ArrayIndexOutOfBoundsException I){
                System.out.println("Exception: " + I);
            }
        }
        catch(ArithmeticException e){
            System.err.println(e);
        }
    }
}