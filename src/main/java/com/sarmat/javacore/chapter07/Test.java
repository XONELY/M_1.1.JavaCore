package chapter07;

import java.sql.SQLOutput;

public class Test {
    int a, b;
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
    void meth(Test o){
        o.a*=2;
        o.b/=2;
    }
    Test() {
    }

    Test(int i, int j) {
        a = i;
        b = j;
    }
    Test(int i) {
        a =i;
    }
Test incrByTen(){
        Test temp = new Test(a+10);
        return temp;
}
    boolean equals(Test o) {
        if (o.a == a && o.b == b) return true;
        else return false;
    }
}

class PassOb {
    public static void main(String[] args) {
        Test ob1 = new Test(100, 22);
        Test ob2 = new Test(100, 22);
        Test ob3 = new Test(-1, -1);
        System.out.println("ob1 == ob2:" + ob1.equals(ob2));
        System.out.println("ob1 == ob3:" + ob1.equals(ob3));
    }
}

class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();
        int a = 15, b = 20;
        System.out.println("a & b before " + a + " " + b);
        ob.meth(a,b);
        System.out.println("a & b after " + a + " " + b);


    }
}
class PassObjRe{
    public static void main(String[] args){
        Test ob = new Test(15,20);
        System.out.println("ob.a and ob.b before: "+ ob.a +" "+ob.b);
        ob.meth(ob);
        System.out.println("ob.a and ob.b after: "+ ob.a +" "+ob.b);
    }
}
class RetOb{
    public static void main(String[] args){
        Test ob1 = new Test(2);
        Test ob2;
        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: "+ ob1.a);
        System.out.println("ob2.a: "+ ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2.a after second increase "+ob2.a);

    }
}