package chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class BRReadLines {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        String str;
        System.out.println("TYPE SOME TEXT: ");
        System.out.println("TYPE STOP TO STOP?");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("STOP"));
    }
}
