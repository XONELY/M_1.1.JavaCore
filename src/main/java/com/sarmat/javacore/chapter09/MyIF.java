package main.java.com.sarmat.javacore.chapter09;

public interface MyIF {
    int getNumber();
    default String getString(){
        return "String default";
    }
}

class MyIFImp implements MyIF{
    public int getNumber(){
        return 100;
    }
}
class MyIFImp2 implements MyIF{
    public int getNumber(){
        return 100;
    }
    public String getString(){
        return "another string";
    }
}

class DefaultMethodDemo {
    public static void main(String[] args){
        MyIFImp obj = new MyIFImp();

        System.out.println(obj.getNumber());
        System.out.println(obj.getString());
    }
}