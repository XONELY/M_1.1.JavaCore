package main.java.com.sarmat.javacore.chapter07;

public class Stack2 {
    private int[] stck = new int[10];
    private int tos;
    Stack2(){
        tos=-1;
    }
    void push(int item){
        if(tos==9)
            System.out.println("Stack is full");
        else
            stck[++tos] = item;
    }
    int pop(){
        if (tos<0){
            System.out.println("Stack is not loaded");
            return 0;
        }else return  stck[tos--];
    }
}
class TestStack {
    public static void main(String[] args){
        Stack2 mystack1 = new Stack2();
        Stack2 mystack2 = new Stack2();

        for(int i=0;i<10;i++) mystack1.push(i);
        for(int i=10;i<20;i++) mystack2.push(i);
        System.out.println("Stack 1");
        for(int i =0;i<10;i++)
            System.out.println(mystack1.pop());

        System.out.println("Stack 2");
        for(int i =0;i<10;i++)
            System.out.println(mystack2.pop());

    }
}