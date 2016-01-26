
package uits.jv1503.ht17xml;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.dom4j.DocumentException;

public class App {
    
        public static void main(String[] args) throws IOException, FileNotFoundException, DocumentException {
//        new DocumentCreator().createDocument();
       // ReadDocumentFromFile.readFromFile("output.xml");
        DocumentParser dp = new DocumentParser();
        dp.printDocumentCharacteristics();
    }
    
}
