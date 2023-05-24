package main.java.com.sarmat.javacore.chapter07;

public class PassArray {
    static void vTest(int v[]){
        System.out.print("Количество аргументов "+v.length+" Содержимое= ");

        for(int x : v)
            System.out.print(x+" ");
        System.out.println();
    }
    public static void main(String[] args){
        int n1[] ={10};
        int n2[] = {1,2,3};
        int n3[] ={ };
        vTest(n1);
        vTest(n2);
        vTest(n3);
    }
}

