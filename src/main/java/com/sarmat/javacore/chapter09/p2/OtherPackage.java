package main.java.com.sarmat.javacore.chapter09.p2;

import main.java.com.sarmat.javacore.chapter09.p1.Protection;

public class OtherPackage {
    OtherPackage(){
        Protection p = new Protection();
        System.out.println("contructor from other packet");

        //System.out.println("n= "+p.n);
        //System.out.println("n_pri"+p.n_pri);

        //System.out.println("n_pro"+p.n_pro);
        System.out.println("n_pub"+p.n_pub);
    }
}

//тут доступен только паблик тк этот класс не наследует (для protected)+ переменная находится за пределами класса где обьявлена с модификатором(private)+ p.n недоступна тк другой пакет
