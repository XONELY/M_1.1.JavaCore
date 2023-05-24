package main.java.com.sarmat.javacore.chapter09.Bal;

public class Balance {
    String name;
    double bal;
    Balance(String n, double b) {
        name = n;
        bal = b;
    }
    void show(){
        if(bal<0)
            System.out.print(">>> ");
        System.out.println(name+": $"+bal);
    }
}

class AccountBalance{
    public static void main(String[] args){
        Balance current[] = new Balance[3];
        current[0] = new Balance("ONE",123.32);
        current[1] = new Balance("TWO",157.02);
        current[2] = new Balance("THREE",-12.33);

        for (Balance cur: current) {
            cur.show();
        }
    }
}
