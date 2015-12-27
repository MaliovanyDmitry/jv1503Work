package uits.jv.javaio;

import java.io.File;
import java.io.PrintWriter;


public class PrintWriterExample {


    public static void main(String[] args) {
        printWriterExample();
    }
    
    public static void printWriterExample(){
        File printWriter = new File("printWriter");
        PrintWriter p = new PrintWriter(System.out);
        p.write("some text");
        p.flush();
    }
    
}
