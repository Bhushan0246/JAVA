class Varargs{
    static void test(String msg, int... v){
        System.out.println("Vararg " + msg);
        System.out.println("length: " + v.length);
        System.out.print("Contents: ");
        for(int x : v)
            System.out.print(x + " ");
        System.out.println("\n-----------------");
    }
    public static void main(String[] args){
        test("One", 21, 54, 87);
        test("Two", 159, 357);
        test("Three");
    }
}