
package uits.jv1503.task_0.phone;

public class App {
    public static void main(String[] args) {
    
        Phone[] phones = inerPhones();
        getPhonesBySityCalls(phones, 500);
        getPhonesByLongDistanceCalls(phones);
        sortBySecondName(phones);
        
    }
    
    public static Phone[] inerPhones(){
        Phone[] phones = new Phone[10];
        phones[0] = new Phone(0, "gggsecondName", "eeename", "aaapatronymic", "qqqadress", 4569987441233654L, 45696, 98523, 100, 300);
        phones[1] = new Phone(1, "jjjsecondName", "rrrname", "ssspatronymic", "wwwadress", 1236547885214569L, 14589, 17896, 600, 300);
        phones[2] = new Phone(2, "lllsecondName", "tttname", "dddpatronymic", "eeeadress", 3214569878544123L, 52369, 96352, 400, 0);
        phones[3] = new Phone(3, "mmmsecondName", "yyyname", "fffpatronymic", "rrradress", 4569214774123654L, 41258, 85179, 500, 0);
        phones[4] = new Phone(4, "aaasecondName", "uuuname", "gggpatronymic", "tttadress", 4569936897433654L, 74123, 49635, 650, 800);
        phones[5] = new Phone(5, "cccsecondName", "iiiname", "hhhpatronymic", "yyyadress", 3589637441233654L, 45698, 91735, 100, 400);
        phones[6] = new Phone(6, "vvvsecondName", "oooname", "jjjpatronymic", "uuuadress", 3289647441233654L, 74125, 73914, 100, 0);
        phones[7] = new Phone(7, "bbbsecondName", "pppname", "kkkpatronymic", "iiiadress", 1289653441233654L, 27895, 82465, 200, 400);
        phones[8] = new Phone(8, "nnnsecondName", "aaaname", "lllpatronymic", "oooadress", 1793647441233654L, 48963, 73829, 700, 0);
        phones[9] = new Phone(9, "wwwsecondName", "wwwname", "zzzpatronymic", "pppadress", 3698521441233654L, 45896, 91827, 400, 300);
        return phones;
    }
    
    public static void getPhonesBySityCalls(Phone[] phones, int sityCalls){
        System.out.println("a) сведения об абонентах, у которых время внутригородских разговоров \n" +
                        "превышает заданное;" + sityCalls);
        for (int i = 0; i < phones.length; i++) {
            if (phones[i].getSityCalls() > sityCalls) {
                System.out.println(phones[i].toString());
            }
        }
    }
    
    public static void getPhonesByLongDistanceCalls(Phone[] phones){
        System.out.println(" ");
        System.out.println("b)  сведения об абонентах, которые пользовались междугородной связью;");
        for (int i = 0; i < phones.length; i++) {
            if (phones[i].getLongDistanceCalls() > 0) {
                System.out.println(phones[i].toString());
            }
        }
    }
    
    public static void sortBySecondName(Phone[] phones){
    System.out.println(" ");
    System.out.println("c)  сведения об абонентах в алфавитном порядке.");
        for (int j = 0; j < phones.length; j++) {
            for (int i = j + 1; i < phones.length; i++) { 
                if (phones[i].getSecondName().compareTo(phones[j].getSecondName()) < 0) { 
                    Object t = phones[j];
                    phones[j] = phones[i];
                    phones[i] = (Phone) t;
                } 
            }  
        }
        printPhones(phones);
    }
    public static void printPhones(Phone[] phones){
        for (Phone phone : phones) {
            System.out.println(phone);
        }
    }
}
