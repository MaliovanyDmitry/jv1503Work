
package uits.jv1503.lesson12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    
    public static void main(String[] args) {
        BufferedReader br = null; 
        try {
            new BufferedReader(new FileReader("d:\\1.txt"));
            System.out.println(br.readLine());
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                }
            }
        }
    }
}
