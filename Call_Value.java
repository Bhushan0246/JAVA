class Call_Value{
    void math(int i, int j){
        i *= 2;
        j /= 2;
        System.out.println("a and b: " + i + ", " + j);
    }
}
class Test{
    public static void main(String[] args){
        int a = 40, b = 50;
        Call_Value obj = new Call_Value();
        System.out.println("Before call a and b: " + a + ", " + b);
        obj.math(a,b);
        System.out.println("After call a and b: " + a + ", " + b);
    }
}