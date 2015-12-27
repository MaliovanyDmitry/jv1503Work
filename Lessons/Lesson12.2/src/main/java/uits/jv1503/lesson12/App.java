
package uits.jv1503.lesson12;

import java.io.BufferedReader;
import java.io.FileReader;


public class App {
    
    public static void main(String[] args) throws Exception {
        
        try (BufferedReader br = new BufferedReader(new FileReader("d:\\1.txt"));){
            System.out.println(br.readLine());
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    
}
