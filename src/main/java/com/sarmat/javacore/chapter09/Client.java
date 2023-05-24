package main.java.com.sarmat.javacore.chapter09;

public class Client implements CallBack {
    public void callback(int p){
        System.out.println("Method callback() with value "+p);
    }

    void nonIFaceMeth(){
        System.out.println("NonIFaceMeth");
    }
}
