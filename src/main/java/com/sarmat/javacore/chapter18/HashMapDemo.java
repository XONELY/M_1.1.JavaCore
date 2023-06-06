package chapter18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> hm = new HashMap<String, Double>();

        hm.put("text1", new Double(3434.34));
        hm.put("text2", new Double(123.22));
        hm.put("text3", new Double(-3434.34));
        hm.put("text4", 3534.34);
        hm.put("text5", new Double(34.3004));

        Set<Map.Entry<String,Double>> set = hm.entrySet();
        for(Map.Entry<String,Double> me :set){
            System.out.print(me.getKey()+": ");
            System.out.println(me.getValue());
        }
        double balance = hm.get("text1");
        hm.put("text1", balance+1000);
        System.out.println("new text1 bal: "+hm.get("text1"));
    }
}
