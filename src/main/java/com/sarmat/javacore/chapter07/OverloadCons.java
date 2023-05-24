package main.java.com.sarmat.javacore.chapter07;

public class OverloadCons {
    public static void main(String[] args){
        Box mybox1 = new Box();
        Box mybox2 = new Box(10,20,15);
        Box myCube = new Box(7);
        double vol;
        vol = mybox1.volume();
        System.out.println("MYBOX1 VOLUME = "+vol);

        vol = mybox2.volume();
        System.out.println("MYBOX2 VOLUME = "+vol);

        vol = myCube.volume();
        System.out.println("MYBOX3 VOLUME = "+vol);
    }
}
