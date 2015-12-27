package uits.jv.javaio.files;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


public class FIleIOExample {
    
    public static void saveFromNet(final String filename, final String urlString)throws MalformedURLException, IOException {
        BufferedInputStream in = null;
        FileOutputStream fout = null;
        try {
            in = new BufferedInputStream(new URL(urlString).openStream());
            fout = new FileOutputStream(filename+".jpg");

            final byte data[] = new byte[1024];
            int count;
            while ((count = in.read(data, 0, 1024)) != -1) {
                fout.write(data, 0, count);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (fout != null) {
                fout.close();
            }
        }
    }
    
    public static void main(String[] args) {
        try{
            saveFromNet("mobscene2", "http://www.helnwein.com/images/raw/7089572035310465332");
        }catch(MalformedURLException ex){
            
        }catch(IOException ex){
            
        }
    }
    
}
