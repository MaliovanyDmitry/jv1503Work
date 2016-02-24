
package uits.jv1503.task_0.abiturient;

public class App {
    
    public static void main(String[] args) {

        Abiturient[] abiturients = initAbiturients();
        selectAbiturientsWithPoorGrades(abiturients);
        selectAbitWhoSkoreAboutGiven(abiturients, 28);
        selectAbitHighestScore(abiturients, 3);
    }
    public static Abiturient[] initAbiturients(){
        Abiturient[] abiturients = new Abiturient[10];
        abiturients[0] = new Abiturient(0, "dhgdfhhgd", "srhgfhzfg", "zdghzdghzg", "azfghzfghfz", 80564789641L, new byte[]{5,4,3,2,3,4,5});
        abiturients[1] = new Abiturient(1, "dghdffhhgd", "dryfhzfg", "zdghzdghzg", "azfghzfghfz", 80564789641L, new byte[]{3,4,5,4,5,4,5});
        abiturients[2] = new Abiturient(2, "jhkfhhgd", "rjrfhzfg", "zdghzdghzg", "azfghzfghfz", 80564789641L, new byte[]{5,5,5,5,4,5,5});
        abiturients[3] = new Abiturient(3, "Sddfhhgd", "tyufhzfg", "zdghzdghzg", "azfghzfghfz", 80564789641L, new byte[]{4,4,4,4,4,5,4});
        abiturients[4] = new Abiturient(4, "ryugdfhhgd", "weratfhzfg", "zdghzdghzg", "azfghzfghfz", 80564789641L, new byte[]{4,4,4,4,3,4,4});
        abiturients[5] = new Abiturient(5, "ahgdfhhgd", "jytgfhzfg", "zdghzdghzg", "azfghzfghfz", 80564789641L, new byte[]{3,3,3,4,3,3});
        abiturients[6] = new Abiturient(6, "erygdfhhgd", "zzsehzgfhzfg", "zdghzdghzg", "azfghzfghfz", 80564789641L, new byte[]{3,3,3,5,5,4,4,});
        abiturients[7] = new Abiturient(7, "aegdfhhgd", "strufhzfg", "zdghzdghzg", "azfghzfghfz", 80564789641L, new byte[]{5,4,3,4,5,2,3});
        abiturients[8] = new Abiturient(8, "wetfhhgd", "srtyfhzfg", "zdghzdghzg", "azfghzfghfz", 80564789641L, new byte[]{2,3,4,3,2,3,2});
        abiturients[9] = new Abiturient(9, "werthhgd", "trshrtfhzfg", "zdghzdghzg", "azfghzfghfz", 80564789641L, new byte[]{3,2,4,5,4,3,2});
        return abiturients;
    }

    public static void selectAbiturientsWithPoorGrades(Abiturient[] abiturients){
        System.out.println(" ");
        System.out.println("список абитуриентов, имеющих неудовлетворительные оценки:");
        for (int i = 0; i < abiturients.length; i++) {
            for (int j = 0; j < abiturients[i].getRating().length; j++) {
                if(abiturients[i].getRating()[j] == 2){
                    System.out.println(abiturients[i].toString());
                    break;
                }
            }
        }
    }
    public static void selectAbitWhoSkoreAboutGiven(Abiturient[] abiturients, int score){
        System.out.println(" ");
        System.out.println("список абитуриентов, у которых средний балл " + score + " и выше:");
        for (int i = 0; i < abiturients.length; i++) {
            int summ = 0;
            for (int j = 0; j < abiturients[i].getRating().length; j++){
                summ += abiturients[i].getRating()[j];
                if(summ >= score){
                    System.out.println(abiturients[i].toString());
                    break;
                }    
            }
        }
    }
    
    public static void selectAbitHighestScore(Abiturient[] abiturients, int number){
      System.out.println(" ");
      System.out.println("c)  выбрать заданное число n-абитуриентов, имеющих самую высокую :"+ number );
      for (int j = 0; j < abiturients.length; j++) {
            for (int i = j + 1; i < abiturients.length; i++) { 
                if (abiturients[i].getMarksSumm() > abiturients[j].getMarksSumm()) { 
                    Object t = abiturients[j];
                    abiturients[j] = abiturients[i];
                    abiturients[i] = (Abiturient) t;
                } 
            }  
        }
        int n = 0; 
        for (Abiturient abiturient : abiturients) {
            if(n >= number){
                break;
            }
            System.out.println(abiturient.toString()+" : "+abiturient.getMarksSumm());
            n++;
        }
    }
}
    
    
    
    
    
    
    

    
    

