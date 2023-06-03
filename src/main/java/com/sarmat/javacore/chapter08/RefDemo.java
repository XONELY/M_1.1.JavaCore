package chapter08;

public class RefDemo {
    public static void main(String[] args){
        BoxWeight weightbox = new BoxWeight(3,5,7,8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("1 V= "+vol);
        System.out.println("1 W= "+weightbox.weight);

        System.out.println();

        plainbox = weightbox;
        vol = plainbox.volume();
        System.out.println("2 V= "+vol);
        //System.out.println("2 W= "+plainbox.weight);

    }
}
