package chapter07;

class Stack3 {
    private int stck[];
    private int tos;
    Stack3(int size){
    stck = new int[size];
    tos=-1;
    }
    void push(int item){
        if(tos==stck.length-1)
            System.out.println("stack is full");
        else
            stck[++tos] = item;
    }
    int pop(){
        if(tos<0){
            System.out.println("Stack is not loaded");
            return 0;
        }else return stck[tos--];
    }
}

class TestStack3 {
    public static void main(String[] args){
        Stack3 mystack1 = new Stack3(5);
        Stack3 mystack2 = new Stack3(8);

        for(int i =0;i<5;i++) mystack1.push(i);
        for(int i =0;i<8;i++) mystack2.push(i);

        System.out.println("stack in ms1 ");
        for(int i = 0;i<5;i++)
            System.out.println(mystack1.pop());

        System.out.println("stack in ms2 ");
        for(int i = 0;i<8;i++)
            System.out.println(mystack2.pop());
    }
}