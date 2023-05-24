package main.java.com.sarmat.javacore.chapter07;

public class OverloadCons2 {
    public static void main(String[] args){
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box();
        Box myCube = new Box(7);

        Box myclone = new Box(mybox1);

        double vol;

        vol=mybox1.volume();
        System.out.println("Обьем mybox1 = "+vol);

        vol=mybox2.volume();
        System.out.println("Обьем mybox2 = "+vol);

        vol=myCube.volume();
        System.out.println("Обьем myCube = "+vol);

        vol=myclone.volume();
        System.out.println("Обьем myclone = "+vol);
    }
}
