package main.java.com.sarmat.javacore.chapter03;

public class BoolTest
{
    public static void main(String args[]){
        boolean b;
        b = false;
        System. out .println ( "b равно " + b) ; b = true;
        System.out.println("b равно " + b);
        if(b) System.out.println("этот код выполняется"); //тк b = true код выполняется
        b = false;
        if(b) System.out.println("Этoт код не выполняется");

    }
}
