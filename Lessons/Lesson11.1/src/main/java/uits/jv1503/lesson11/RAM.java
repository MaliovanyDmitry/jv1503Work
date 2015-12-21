
package uits.jv1503.lesson11;

public class RAM {
    
    private String vendor;
    private int size;
    private RamType type;

    

    public enum RamType{
        DDR1, DDR2, DDR3, DDR4;
    }

    public RAM(String vendor, int size, RamType type) {
        this.vendor = vendor;
        this.size = size;
        this.type = type;
    }
    
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setType(RamType type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public RamType getType() {
        return type;
    }

    public String getVendor() {
        return vendor;
    }
    
    @Override
    public String toString() {
        return " [ vendor: " + this.vendor + " type: " + this.type + " syze: " + this.size + " ]";
    }
    
    
    
    
    
    
}

