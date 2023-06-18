package chapter10;

public class FinallyDemo {
    static void procA() {
        try {
            System.out.println("in method procA()");
            throw new RuntimeException("DEMO");
        } finally {
            System.out.println("Finally in procA()");
        }
    }

    static void procB(){
        try{
            System.out.println("in method procB()");
            return;
        }finally{
            System.out.println("Finally in procB()");
        }
    }
    static void procC(){
        try{
            System.out.println("in method procC()");
        } finally{
            System.out.println("Finally in procC()");
        }
    }


    public static void main(String[] args) {
        try{
            procA();
        }catch (Exception e){
            System.out.println("Exception");
        }

        procB();
        procC();
    }
}
