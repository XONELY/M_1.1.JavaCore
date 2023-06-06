package chapter18;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("F");
        ll.addFirst("A");
        ll.add(1,"A2");


        System.out.println("Ishodnoe soderjimoe linked list "+ll);
        ll.remove("F");
        ll.remove(2);

        System.out.println("Soderjimoe ll posle udaleniya "+ll);


        ll.removeFirst();
        ll.removeLast();
        System.out.println("Soderjimoe ll posle udaleniya#2 "+ll);

        String val = ll.get(2);
        ll.set(2, val+" izmeneno");
        System.out.println("Soderjimoe ll posle izmeneniya "+ll);
    }
}
//sorry for this russinglish