package chapter07;

public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;
        int i = 88;
        ob.test();
        ob.test(10);
        ob.test(10, 10);
        result = ob.test(123.25);
        System.out.println("Result ob.test (double)" + result);

        ob.test(i);
        ob.test(123.2);
    }
}
