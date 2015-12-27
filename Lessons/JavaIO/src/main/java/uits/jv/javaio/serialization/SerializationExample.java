package uits.jv.javaio.serialization;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Random;

public class SerializationExample {

    public static void main(String[] args) throws ClassNotFoundException, IOException{
        System.out.println("Serialization write");
        testSerializationWriteFile();
        System.out.println("Serialization read");
        testSerializationReadFile();
    }
    
    public static void testSerializationWriteFile()throws IOException{
        File file = new File("persons");
        if(!file.exists())
            file.createNewFile();
        OutputStream out = new FileOutputStream(file);
        ObjectOutputStream personStream = new ObjectOutputStream(out);
        Random rand = new Random();
        for(int i = 0; i < 10; i++){
            Person p = new Person();
            p.setAge(rand.nextInt(30));
            p.setName("person - " + i);
            p.setGender(Person.Gender.byOrder(rand.nextInt(2)));
            personStream.writeObject(p);
        }
        personStream.flush();
    }
    
    public static void testSerializationReadFile() throws IOException, ClassNotFoundException{
        File file = new File("persons");
        InputStream in = new FileInputStream(file);
        ObjectInputStream personStream = new ObjectInputStream(in);
        
        Object o;
        try{
            while(true){
                o = personStream.readObject();
                System.out.println(((Person)o).toString());
            }
        }catch(EOFException ex){
            System.out.println("reached end of file");
        }
    }
    
}
