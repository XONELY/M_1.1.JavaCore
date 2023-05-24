package main.java.com.sarmat.javacore.chapter09;

public class TestIFace {
    public static void main(String[] args) {
        CallBack c = new Client();
        c.callback(42);
    }
}
