package main.java.com.sarmat.javacore.chapter03;

public class LifeTime {
    public static void main(String[] args){
        int x;
        for(x=0;x<3;x++){
            int y =-1;
            System.out.println("y = "+y);
            y = 100;
            System.out.println("Now y is "+y);
        }
    }
}
