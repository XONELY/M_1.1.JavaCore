package chapter10;

public class ChainExcDemo {
    static void demoproc() {
        NullPointerException e = new NullPointerException("Upper ");
        e.initCause(new ArithmeticException("cause"));
        throw e;
    }

    public static void main(String[] args) {
        try{
            demoproc();
        }catch(NullPointerException e){
            System.out.println("exception -- "+e);
            System.out.println("cause -- "+e.getCause());
        }
    }
}
