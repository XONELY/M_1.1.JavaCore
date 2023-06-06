package chapter18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        System.out.println("Исходное содержимое списочного массива al: ");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()){
            String element = itr.next();
            System.out.print(element+" ");
        }
        System.out.println();

        ListIterator<String> litr = al.listIterator();
        while(litr.hasNext()){
            String element = litr.next();
            litr.set(element+"+");

        }
        System.out.println("Измененное содержимое списочного массива al: ");
        itr = al.iterator();
        while(itr.hasNext()){
            String element = itr.next();
            System.out.print(element+" ");
        }
        System.out.println();
        System.out.println("теперь в обратном порядке ");
        while(litr.hasPrevious()){
            System.out.print(litr.previous()+" ");
        }
        System.out.println();

    }
}
