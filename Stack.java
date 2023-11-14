import java.util.Scanner;
class Stack{
    Scanner sc = new Scanner(System.in);
    int tos;
    int size;
    int stk[];
    Stack(int size){
        tos = -1;
        this.size = size;
        stk = new int[size];
    }
    void push(int item){
        if(tos < size)
            stk[++tos] = item;
        else
            System.out.println("Stack Overflow!");
    }
    int pop(){
        if(tos < 0){
            System.out.println("Stack Underflow!");
            return 0;
        }
        else{
            System.out.println("Popped element: " + stk[tos]);
            return stk[tos--];
        }
    }
    void display(){
        for(int i = tos; i>=0; i--)
            System.out.println(stk[i]);
    }
}

class TestStack{
    static void strike(){
        for(int i=0; i<50; i++)
            System.out.print(":");
        System.out.println("");
    }
    public static void main(String[] args){
        Scanner scc = new Scanner(System.in);
        System.out.print("Size of stack? ");
        Stack st1 = new Stack(scc.nextInt());
        /*Calling push() method equals to size of Stack to avoid Overflow. */
        for(int i=0; i<st1.size; i++)
        st1.push(90-i);

        st1.display();
        strike();
        /*Calling pop() method to remove element from Stack. */
        st1.pop();
        st1.pop();
        st1.push(1011);

        st1.display();
    }
}