
package uits.jv1503.hometask7;

public class TrianglesInTheConsole {
    public static void main(String[] args) {
        
        String sarr[][] = new String[5][5];
        
        for (int i=0;i<=sarr.length-1;i++){
            for (int j=0;j<=sarr[i].length-1;j++){
                sarr[i][j]=" ";
                System.out.print(sarr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        
        for (int i=0;i<=sarr.length-1;i++){ 
            for (int j=i;j<=sarr[i].length-1;j++){ 
            sarr[i][j]="0";
            }
        }
        for (int i=0;i<=sarr.length-1;i++){ 
            for (int j=0;j<=sarr[i].length-1;j++){ 
           
            System.out.print(sarr[i][j]);
            } 
        System.out.println();
        }

        System.out.println();

        for (int i=sarr.length-1;i>=0;i--){ 
            for (int j=i;j<=sarr[i].length-1;j++){ 
            sarr[i][j]="0";
            }
        }
        
        for (int i=sarr.length-1;i>=0;i--){ 
            for (int j=0;j<=sarr[i].length-1;j++){ 
           
            System.out.print(sarr[i][j]);
            } 
        System.out.println();
        }
      
        System.out.println();

        for(int i = 0; i<sarr.length; i++){
            sarr[i] = new String[i+1];
            for(int j = 0; j<sarr[i].length; j++){
            sarr[i][j]="0";  
            System.out.print(sarr[i][j]);
            } 
        System.out.println();
        }
        
        System.out.println();
 
        for(int i = sarr.length-1; i>=0; i--){
             sarr[i] = new String[i+1];
            for(int j = 0; j<sarr[i].length; j++){
            sarr[i][j]="0";  
            System.out.print(sarr[i][j]);
            } 
        System.out.println();
        }
    }
}
