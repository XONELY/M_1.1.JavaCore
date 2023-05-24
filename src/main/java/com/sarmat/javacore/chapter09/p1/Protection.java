package main.java.com.sarmat.javacore.chapter09.p1;

import javax.crypto.spec.PSource;

public class Protection {
    int n = 1;
    private int n_pri = 2;
    protected int n_pro = 3;
    public int n_pub = 4;

    public Protection(){
        System.out.println("конструктор базового класса");
        System.out.println("N= " + n);
        System.out.println("N_pri= " + n_pri);
        System.out.println("N_pro= " + n_pro);
        System.out.println("N_pub= " + n_pub);
    }
}


