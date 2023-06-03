package chapter09;

public class AnotherClient implements CallBack {
    public void callback(int p){
        System.out.println("another version of callback");
        System.out.println("p^2= "+(p*p));
    }
}
