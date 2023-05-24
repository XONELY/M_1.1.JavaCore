package main.java.com.sarmat.javacore.chapter07;

public class UseStatick {
    static int a =3;
    static int b;
    static void meth(int x){
        System.out.println("x= " +x);
        System.out.println("a= " +a);
        System.out.println("b= " +b);
    }
    static {
        System.out.println("Static block");
        b = a*4;
    }
    public  static void main(String[] args){
        meth(42);
    }
}
