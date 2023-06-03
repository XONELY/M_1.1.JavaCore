package chapter08;

public class A3 {
    void callme() {
        System.out.println("call from A");
    }
}

class B3 extends A3 {
    void callme() {
        System.out.println("call from B");
    }
}

class C3 extends A3 {
    void callme() {
        System.out.println("call from C");
    }
}

class Dispatch {
    public static void main(String[] args) {
        A3 a = new A3();
        B3 b = new B3();
        C3 c = new C3();

        A3 r;

        r = a;
        r.callme();

        r = b;
        r.callme();

        r = c;
        r.callme();


    }
}
