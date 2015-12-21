
package uits.jv1503.lesson11;

public class Drive {
    
    String vender;
    int size;
    driveType type;

    
    
    public enum driveType{
        HDD, SSD, CD, DVD, CDDVD, FDD;
    }

    public Drive(String vender, int size, driveType type) {
        this.vender = vender;
        this.size = size;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public String getVender() {
        return vender;
    }

    public driveType getType() {
        return type;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setVender(String vender) {
        this.vender = vender;
    }

    public void setType(driveType type) {
        this.type = type;
    }
    
    @Override
    public String toString() {
        return " [ vender: " + this.vender + " type: " + this.type + " syze: " + this.size + " ]";
    }
    
    
    
  

    
    
}
