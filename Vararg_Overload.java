class Vararg_Overload{
    static void test(String msg, int... v){
        System.out.print(msg + " Contents: ");
        for(int x : v)
            System.out.print(x + " ");
        System.out.println("\t\tLength: " + v.length);
    }
    static void test(String msg, Double... d){
        System.out.print(msg + " Contents: ");
        for(double x : d)
            System.out.print(x + " ");
        System.out.println("\tLength: " + d.length);
    }
    static void test(String msg, char... ch){
        System.out.print(msg + " Contents: ");
        for(char c : ch)
            System.out.print(c + " ");
        System.out.println("\t\tLength: " + ch.length);
    }
    static void test(String msg1, String msg2, String... str){
        System.out.print(msg1 + msg2 + " Contents: ");
        for(String w : str)
            System.out.print(w);
        System.out.println("\tLength: " + str.length);
    }
    public static void main(String[] args){
        test("Integers", 1, -5, 4, 6, 10);
        test("Double", 54.12, 54.36, 87.4, 98.90);
        test("Character", 'J', 'A', 'V', 'A');
        test("String ", "vararg", "Hello", "World", ".", "JAVA");
    }
}