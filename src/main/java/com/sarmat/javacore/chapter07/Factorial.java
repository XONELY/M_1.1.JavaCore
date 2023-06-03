package chapter07;

public class Factorial {
    int Fact(int n) {
        int result;
        if (n == 1) return 1;
        result = Fact(n - 1) * n;
        return result;
    }
}
class Recursion{
    public static void main(String[] args){
        Factorial f = new Factorial();
        System.out.println(f.Fact(3));
        System.out.println(f.Fact(4));
        System.out.println(f.Fact(5));

    }
}

