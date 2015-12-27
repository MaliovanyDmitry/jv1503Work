package uits.jv.javaio.files;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Files {
    
    public static void main(String[] args) throws IOException{
        createFileWithPathStruct("test", "c:\\somedir\\subdir");
    }
    
    public static void simpleUsage()throws IOException{
        File file = new File("test");
        if(!file.exists()){
            file.createNewFile();
        }
    }
    
    public static void createFileWithPathStruct(String filename, String path) throws IOException{
        File file = new File(path);
        if(!file.exists()){
            file.mkdirs();
        }
        file = new File(path+"/"+filename);
        if(!file.exists()){
            file.createNewFile();
        }
        FileWriter writer = new FileWriter(file);
        String str = "sample file content";
        for(final char c : str.toCharArray())
            writer.append(c);
        writer.flush();
        writer.close();
        
        
    }
    
}
