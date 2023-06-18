package chapter13;

import java.io.*;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;
        if (args.length != 1) {
            System.out.println("ShowFile *File_Name*");
            return;
        }
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Error: this file cant be opened");
            return;
        }

        try {
            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Error: cant read this file");
        }
        try {
            fin.close();
        } catch (IOException e) {
            System.out.println("Error: cant close this file");
        }

        /*finally{
        try{if(fin!=null)fin.close();}
        catch(IOException e){
            System.out.println("Error: cant close this file");
        }*/
    }
}
