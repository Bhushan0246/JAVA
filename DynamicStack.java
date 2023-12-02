import java.util.Scanner;
interface IntStack{
    void push(int item);
    int pop();
}
class DynamicStack implements IntStack{
    private int stk[];
    private int tos;
    DynamicStack(int size){
        stk = new int[size];
        tos = -1;
    }
    public void push(int item){
        if(tos == stk.length-1){
            int[] temp = new int[stk.length + 5];
            for(int i=0; i<stk.length; i++)
                temp[i] = stk[i];
            stk = temp;
            stk[++tos] = item;
        }
        else
            stk[++tos] = item;
    }
    public int pop(){
        if(tos < 0){
            System.out.println("Stack Underflow.");
            return -1;
        }
        else
            return stk[tos--];
    }
    int getLength(){
        return stk.length;
    }
}
class TestStack{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Stack size? ");
        int size = sc.nextInt();
        DynamicStack ob = new DynamicStack(size);
        for(int i = 0; i < size+3; i++)
            ob.push(i+12);
        System.out.println("Stack length: "+ob.getLength());
        System.out.println("Stack elements: ");
        for(int i = 0; i < ob.getLength(); i++)
            System.out.println(ob.pop());
    }
}