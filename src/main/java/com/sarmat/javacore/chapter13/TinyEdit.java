package chapter13;
import java.io.*;

public class TinyEdit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = new String[100];
        System.out.println("Type some strings");
        System.out.println("Type STOP to stop");
        for(int i = 0; i<100; i++){
            str[i] = br.readLine();
            if(str[i].equals("STOP")) break;
        }
        System.out.println("\n ur file text: ");
        for(int i=0;i<100;i++){
            if(str[i].equals("STOP")) break;
            System.out.println(str[i]);
        }
    }

}
