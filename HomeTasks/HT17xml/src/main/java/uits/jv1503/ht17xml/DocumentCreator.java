
package uits.jv1503.ht17xml;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class DocumentCreator {
    
    private Document d;

    public DocumentCreator() {
        d = DocumentHelper.createDocument();
    }
    
    public void createDocument()throws IOException{
        
        Element root = addCars();
        
        String[] name = {"Mercedes-Benz","Porsche","Opel","Volkswagen","Maybach","BMW","Audi"};
        String[] volume = {"1.5","2.0","2.5","3.0","3.5","4.0","4.5"};
        String[] color = {"red","green","yellow","black","white","gold","blue"};
        double[] weightCalc = {3000,3500,4000,4500,5000,5500,6000,4300,5300,3300};
//        String pound = ""+(weightCalc[(byte)(Math.random()*10)]);
//        String kilo = (""+(Integer.pound*0.453592));
        for(int i = 0; i < 5; i++){
           
            Element car = addCar(root, ""+i);
            Element characteristics = addCharacteristics(car);
//            Element charact = addCharact(characteristics);
            addCharact(characteristics, name[(byte)(Math.random()*7)], volume[(byte)(Math.random()*7)], color[(byte)(Math.random()*7)]);
            addWeight(characteristics, ""+weightCalc[i],""+weightCalc[i]*0.453592);
           
        }
        
    d.add(root);
     
    printDocument(this.d);
    writeDocument();
        
    }

   
    
    public Element addCars(){
        return DocumentHelper.createElement("cars");
    }
    public Element addCar(Element e, String id){
        return e.addElement("car").addAttribute("id", id);
    }
    public Element addCharacteristics(Element e){
        return e.addElement("characteristics");
    }
    public Element addCharact(Element e, String name, String volume, String color){
        return e.addElement("charact").addAttribute("name", name)
                .addAttribute("volume", volume)
                .addAttribute("color", color);
    } 
    public Element addWeight(Element e, String pound, String kilo){
        return e.addElement("weight").addAttribute("pound", pound).addAttribute("kilo", kilo);
    } 
    
    public void printDocument(Document d) throws IOException{
        OutputFormat format = OutputFormat.createPrettyPrint();
        XMLWriter writer;
        writer = new XMLWriter( System.out, format );
        writer.write( d );
    }
    public void writeDocument()throws IOException{
        OutputFormat format = OutputFormat.createPrettyPrint();
        XMLWriter writer = new XMLWriter(
        new FileWriter( "output.xml" ),format);
        writer.write( d );
        writer.close();
    }
    
    
    
    
}
