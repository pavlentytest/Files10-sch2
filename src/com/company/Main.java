package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*try {
            int a = 100;
            int b = 0;
            int c = a / b;
        } catch(Exception eee) {
            System.out.println("Все хорошо: "+ eee.toString());
        }
        System.out.println("Что-то после...");
*/

	    File file = new File("C:/000/readme.txt");
        try {
            file.createNewFile();
            PrintWriter pw = new PrintWriter(file);
            pw.print("adfadf adgadgf");
            pw.close();
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Все хорошо:"+e.toString());
        }
        System.out.println("Что-то делаем...");



        File file2 = new File("c:/000/ttt.txt");
        // чтение из файла
        // Scanner
        // BufferedReader
        try {

            Scanner scan = new Scanner(file2);
            while(scan.hasNextLine()) {
                // слово - scan.next();
                System.out.println(scan.nextLine());
            }
            while(scan.hasNext()) {
                String word = scan.next();
            }
            scan.close();
            // String
            // методы: split(), length()
            // StringBuffer
            // методы: reverse()


        } catch (FileNotFoundException e) {
            //e.printStackTrace();
        }

    }
}
