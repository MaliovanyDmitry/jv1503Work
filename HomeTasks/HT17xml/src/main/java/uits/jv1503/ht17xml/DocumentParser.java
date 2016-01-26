
package uits.jv1503.ht17xml;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DocumentParser {

    private DocumentBuilder d;
    Document doc;
    
        {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder d = dbf.newDocumentBuilder();
            doc = d.parse(new File("output.xml"));
            doc.normalizeDocument();
        } catch (SAXException ex) {
            
        } catch (IOException ex) {
            
        } catch (ParserConfigurationException ex) {
            
        }
    }
    public DocumentParser(){
        
    }
    
    public void printDocumentCharacteristics(){
        NodeList list = doc.getElementsByTagName("car");
        System.out.println("test nodes count - " + list.getLength());
        printNodeList(list,0);
    }
    
    public void printNode(Node n){
        
        if(!n.getNodeName().startsWith("#")){
            System.out.println(n.getNodeName());
            printNodeList(n.getChildNodes());
        }
    }
    public void printNodeList(NodeList nl){
        for(int i  = 0; i < nl.getLength(); i++){
            printNode(nl.item(i));
        }
    }
    
    public void printNode(Node n, int tab){
        String st = "";
        for(int i = 0; i < tab; i++){
            st +="    ";
        }
        if(!n.getNodeName().startsWith("#")){
            System.out.println(st + n.getNodeName() + " " + getNodeAttributes(n));
            printNodeList(n.getChildNodes(),tab+1);
        }
    }
    
    public void printNodeList(NodeList nl, int tab){
        for(int i  = 0; i < nl.getLength(); i++){
            printNode(nl.item(i), tab+1);
        }
    }
    
    public String getNodeAttributes(Node n){
        String attString = "";
        NamedNodeMap nm = n.getAttributes();
        int c = nm.getLength();
        for(int i = 0; i < c; i++){
            attString += (" " + nm.item(i).getNodeName()+ " = " + nm.item(i).getNodeValue() + " ");
        }
        return attString;
    }
    
}



    

