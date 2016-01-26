
package uits.jv1503.ht17xml;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class ReadDocumentFromFile {

    public static void readFromFile(String filename) throws FileNotFoundException, IOException, DocumentException {
        FileReader reader = new FileReader(filename);
        String s = "";
        char[] cbuff = new char[100];
        int offset;
        while((offset = reader.read(cbuff)) > 0){
            String t = new String(cbuff, 0, offset);
            s+=t;
        }
        Document d = DocumentHelper.parseText(s);
        printDocument(d);
    }
    
    public static void printDocument(Document d) throws IOException{
        OutputFormat format = OutputFormat.createPrettyPrint();
         XMLWriter writer;
         writer = new XMLWriter( System.out, format );
         writer.write( d );
    }


    
}
