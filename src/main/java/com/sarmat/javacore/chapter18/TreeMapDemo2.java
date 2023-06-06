package chapter18;

import java.util.*;


class TComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j, k;
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareTo(bStr.substring(j));
        if (k == 0) return aStr.compareTo(bStr);
        else return k;
    }
}

public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<String, Double>(new TComp());

        tm.put("text1", 3434.34);
        tm.put("text2", 123.22);
        tm.put("text3", 1378.00);
        tm.put("text4", 99.22);
        tm.put("text5", -19.08);

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println();
        double balance = tm.get("text1");
        tm.put("text1", balance + 1000);
        System.out.println("new text1 bal " + tm.get("text1"));
    }
}



