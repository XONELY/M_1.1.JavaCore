package main.java.com.sarmat.javacore.chapter08;

public class A {
    int i, j;

    void showij() {
        System.out.println("i and j = " + i+" " + j);
    }
}

class B extends A {
    int k;

    void showk() {
        System.out.println("K= " + k);
    }

    void sum() {
        System.out.println("sum= " + (super.i + k + j));
    }
}

class SimpleInheritance {
    public static void main(String[] args) {

        A superOb = new A();
        B subOb = new B();

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Содержимое обьекта superOb");
        superOb.showij();
        System.out.println();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;

        System.out.println("Содержимое обьекта subOb");
        subOb.showij();
        subOb.showk();

        System.out.println();
        System.out.println("summ:");
        subOb.sum();
    }
}