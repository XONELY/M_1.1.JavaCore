package main.java.com.sarmat.javacore.chapter09;

import java.sql.SQLOutput;
import java.util.Random;

public class Question implements SharedConstants {
    Random rand = new Random();

    int ask() {
        int prob = (int) (100 * rand.nextDouble());
        if (prob < 30) return NO;
        else if (prob < 60) return YES;
        else if (prob < 75) return LATER;
        else if (prob < 98) return SOON;
        else return NEVER;
    }
}

class AskMe implements SharedConstants{
    static void answer(int result){
        switch(result){
            case NO:
                System.out.println("Нет");
                break;
            case YES:
                System.out.println("ДА");
                break;
            case MAYBE:
                System.out.println("Возможно");
                break;
            case LATER:
                System.out.println("Позднее");
                break;
            case SOON:
                System.out.println("Вскоре");
                break;
            case NEVER:
                System.out.println("Никогда");
                break;
        }
    }
    public static void main(String[] args){
        Question q = new Question();

        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}