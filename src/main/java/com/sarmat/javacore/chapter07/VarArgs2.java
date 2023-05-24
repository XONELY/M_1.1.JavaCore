package main.java.com.sarmat.javacore.chapter07;

public class VarArgs2 {
    static void vaTest(String msg, int... v) {
        System.out.print(msg + v.length + " contains:");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("one length:",10);
        vaTest("two length:",1,2,3);
        vaTest("zero length:");
    }
}
