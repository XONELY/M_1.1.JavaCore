package chapter18;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String,Double> tm = new TreeMap<String,Double>();

        tm.put("text1",3434.34);
        tm.put("text2",123.22);
        tm.put("text3",1378.00);
        tm.put("text4",99.22);
        tm.put("text5",-19.08);

        Set<Map.Entry<String,Double>> set = tm.entrySet();
        for(Map.Entry<String,Double> me : set){
            System.out.print(me.getKey()+": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = tm.get("text1");

        tm.put("text1",balance+1000);
        System.out.println("text1: "+tm.get("text1"));
    }
}
