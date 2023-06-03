package chapter02;

public class Example2 {
    public static void main(String[] args){
        int num; //Декларация переменной
        num = 100; //Инициализация переменной

        System.out.println("Это переменная num:" + num); //Вывод на экран строки и переменной с помощью конкатенации

        num = num * 2; //Новое значение переменной num (умножение на 2)
        System.out.print("Значение переменной num:" + num); //Вывод нового значения переменной num, с помощью метода print (после этой строки не следует символ новой строки)
    }
}
