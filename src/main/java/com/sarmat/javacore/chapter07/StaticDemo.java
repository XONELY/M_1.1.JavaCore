package main.java.com.sarmat.javacore.chapter07;

public class StaticDemo {
    static int a = 42;
    static int b = 99;

    static void CallMe() {
        System.out.println("a = " + a);
    }
}

class StaticByName {
    public static void main(String[] args) {
        StaticDemo.CallMe();
        System.out.println("b= " + StaticDemo.b);
    }
}
