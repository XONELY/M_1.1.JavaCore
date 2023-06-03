package chapter08;

abstract class AbstractA {
    abstract void callme();

    void callmetoo() {
        System.out.println("Это конкретный метод");
    }
}


class AbstractB extends AbstractA {
    void callme() {
        System.out.println("realisation of callme b");
    }
}

class AbstractDemo {
    public static void main(String[] args) {
        AbstractB b = new AbstractB();

        b.callme();
        b.callmetoo();
    }
}