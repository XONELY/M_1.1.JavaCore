public class IfSample {
    public static void main(String args[])
    {

    int x,y;
    x = 10;
    y = 20;

    if (x < y) System.out.println("x меньше y");//Проверка на условие "если х меньше у, то вывести на экран "х меньше у"
    x = x*2; //новое значение х
    if (x == y) System.out.println("x равно у");//Проверка на равенство
    x = x*2; //новое значение х
    if (x > y) System.out.println("х больше у");//Проверка на условие "х больше у"

    }

}
