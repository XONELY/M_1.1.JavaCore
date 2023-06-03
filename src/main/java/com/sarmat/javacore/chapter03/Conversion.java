package chapter03;

public class Conversion {
    public static void main(String[] args){
        byte b;
        int i = 257;
        double d = 323.142;

        b = (byte) i;
        System.out.println("Преобразование типов int => byte " + b); //остается остаток от деления на 256
        System.out.println("Преобразование типов double => int " +(int) d);//отбрасывается все после запятой
        System.out.println("Преобразование типов double => byte " + (byte) d);//отбрасывается все после запятой и делится по модулю на 256

    }
}
