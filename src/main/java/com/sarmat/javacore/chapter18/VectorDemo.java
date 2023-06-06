package chapter18;

import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>(3,2);
        System.out.println(v.size());
        System.out.println(v.capacity());

        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);

        System.out.println(v.capacity());
        v.addElement(5);
        System.out.println(v.capacity());
        v.addElement(6);
        v.addElement(7);
        System.out.println(v.capacity());

        System.out.println();
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());

        Enumeration<Integer> vEnum = v.elements();
        System.out.println("\n Элементы вектора:");
        while(vEnum.hasMoreElements())
            System.out.print(vEnum.nextElement()+" ");
        System.out.println();
    }
}
