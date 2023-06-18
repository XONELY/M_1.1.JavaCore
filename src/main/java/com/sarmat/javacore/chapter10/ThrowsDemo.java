package chapter10;

import java.util.logging.StreamHandler;

public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("in throwOne");
        throw new IllegalAccessException("Demo");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Exception: " + e);
        }
    }
}
