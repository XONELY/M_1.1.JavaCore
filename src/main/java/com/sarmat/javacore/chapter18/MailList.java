package chapter18;

import java.util.LinkedList;

public class MailList {

    public static void main(String[] args) {
        LinkedList<Adress> ml = new LinkedList<Adress>();
        ml.add(new Adress("name1","street1","city1","state1","code1" ));
        ml.add(new Adress("name2","street2","city2","state2","code2" ));
        ml.add(new Adress("name3","street3","city3","state3","code3" ));
        ml.add(new Adress("name4","street4","city4","state4","code4" ));

        for(Adress el : ml)
            System.out.println(el);
    }
}
