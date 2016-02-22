
package uits.jv1503.task_0;

import java.util.Arrays;

public class App {
    
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student(0, "Maliovany", "Dmitry", "Urievich", 1986, "Kharkiv Dmitrievskaya str", 109, "AT", 4, "44-AT");
        students[1] = new Student(1, "Smith", "John", "Johnovich", 1980, "Kharkiv Puchkinskaya str", 101, "EK", 1, "11-EK");
        students[2] = new Student(2, "Daniels", "Jack", "Jackovich", 1982, "Kharkiv Poltavsky Shlakh str", 102, "AT", 4, "44-AT");
        students[3] = new Student(3, "Abramovich", "Roman", "Arkadievich", 1985, "Kharkiv Taganskaya str", 103, "PO", 3, "33-PO");
        students[4] = new Student(4, "hdfgdsf", "dfgdfg", "bdtdrtd", 1987, "Kharkiv dfgdfgdfg str", 109435634, "EK", 1, "11-EK");
        students[5] = new Student(5, "qfgdsfs", "bghjghj", "fghjghj", 1986, "Kharkiv srtysrty str", 109245625, "AT", 3, "34-AT");
        students[6] = new Student(6, "ddfgdf", "hjkhj", "aasadsd", 1985, "Kharkiv sstrysrta str", 10367867, "PO", 3, "33-PO");
        students[7] = new Student(7, "efghfg", "utjggh", "ohjkghjk", 1989, "Kharkiv syty str", 109341, "AT", 3, "34-AT");
        students[8] = new Student(8, "sddfdg", "iyjkhjk", "fdfghf", 1986, "Kharkiv srtsrty str", 1096357, "EK", 1, "11-EK");
        students[9] = new Student(9, "nfghfgh", "cdfgdfg", "lhjkhjk", 1983, "Kharkiv srtusrtu str", 10956758, "PO", 3, "33-PO");
        
        selectByFaculty(students, "EK");
        selectByFacultyAndCourse(students, "AT", 3);
        selectByYoB(students, 1986);
        selectByGroup(students, "44-AT");
        
        Customer[] customers = new Customer[10];
        customers[0] = new Customer(0, "aaa", "ysrhsrth", "aergserth", "aergserth", 1478523669455563L, 14785236);
        customers[1] = new Customer(1, "aaab", "gsdgserg", "aergserth", "aergserth", 2365147896321456L, 45698741);
        customers[2] = new Customer(2, "ddfgfgh", "jetyjetyj", "aergserth", "aergserth", 3254789654122365L, 41236547);
        customers[3] = new Customer(3, "bsthsh", "srjtyjty", "aergserth", "aergserth", 2589963221477852L, 14788963);
        customers[4] = new Customer(4, "afthfsghfg", "rilotuilh", "aergserth", "aergserth", 5236698554788569L, 96322588);
        customers[5] = new Customer(5, "aergserth", "aytyrst", "aergserth", "aergserth", 4123325889633258L, 23655412);
        customers[6] = new Customer(6, "htdhjdgh", "iltuoluo", "aergserth", "aergserth", 6547789665233214L, 54788965);
        customers[7] = new Customer(7, "ddfhgsrh", "srthywrtyh", "aergserth", "aergserth", 5632214558745896L, 85211236);
        customers[8] = new Customer(8, "idthjdj", "wuytyuth", "aergserth", "aergserth", 4569987441233656L, 46766455);
        customers[9] = new Customer(9, "mdtjdtyjd", "ryutiuth", "aergserth", "aergserth", 2541256325892587L, 78534532);
        
        sortBySecondName(customers);
        selectByCreditCartNumber(customers, 3333333333333333L, 6666666666666666L);
        
        Patient[] patients = new Patient[10];
        patients[0] = new Patient(0, "asfgsrh", "wrthyrws", "wrtrtg", "dgagg", 807765432L, 56987412, "a");
        patients[1] = new Patient(1, "aergaerg", "qrtqerf", "trwergt", "trghergdfg", 458965277L, 12365478, "b");
        patients[2] = new Patient(2, "tujtyh", "yuwrtwe", "wrtwrtgw", "aerfgedfgef", 456321456L, 65478963, "c");
        patients[3] = new Patient(3, "rhrsth", "erteryw", "twrtgrh", "ujthtgdrg", 987456321L, 36521478, "d");
        patients[4] = new Patient(4, "rtsrt", "eterte", "wrthwrth", "srthrsth", 123456789L, 32569874, "a");
        patients[5] = new Patient(5, "srthr", "eyerg", "werwef", "rthrsth", 321654987L, 7412058, "b");
        patients[6] = new Patient(6, "rtrty", "qera", "rthrth", "srthrsth", 741258963L, 98532647, "c");
        patients[7] = new Patient(7, "rtryr", "erter", "yujtyhr", "eargethe", 147852369L, 65231478, "d");
        patients[8] = new Patient(8, "trth", "erter", "rhrtgergf", "yerte", 147258369L, 96325874, "a");
        patients[9] = new Patient(9, "yikujty", "ere", "aerfer", "aertaet", 741852963L, 12365478, "b");
        
        selectByDiagnosis(patients, "a");
        selectByMedicalRecordNumber(patients, 40000000, 90000000);
        
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
        
        selectAbiturientsWithPoorGrades(abiturients);
        selectAbitWhoSkoreAboutGiven(abiturients, 28);
    }
    //Выборка студентов по факультетам
    public static void selectByFaculty(Student[] students, String faculty){
        System.out.println("Список студентов факультета " + faculty + ":");
        for (int i = 0; i < 10; i++){ 
            if(students[i].getFaculty().equals(faculty))    
                System.out.println(students[i].toString());
        }
    }
    //Выборка студентов по факультету и курсу    
    public static void selectByFacultyAndCourse(Student[] students, String faculty, int course){
        System.out.println(" ");
        System.out.println("Список студентов факультета " + faculty + ","+ course +"-го курса:");
        for (int i = 0; i < 10; i++){ 
            if(students[i].getFaculty().equals(faculty) && students[i].getCourse() == course)    
                System.out.println(students[i].toString());
        }
    }
    //Выборка студентов по году рождения
    public static void selectByYoB(Student[] students, int yob){
        System.out.println(" ");
        System.out.println("Список студентов факультета, родившихся после " + yob + " года:");
        for (int i = 0; i < 10; i++){ 
            if(students[i].getYob() >= yob)    
                System.out.println(students[i].toString());
        }
    }
    //Выборка студентов по учебной группе
    public static void selectByGroup(Student[] students, String group){
        System.out.println(" ");
        System.out.println("Список студентов группы: " + group);
        for (int i = 0; i < 10; i++){ 
            if(students[i].getGroup().equals(group))    
                System.out.println(students[i].toString());
        }
    }
    //Сортировка покупателей в алфавитном порядке
    public static void sortBySecondName(Customer[] customers){
    System.out.println(" ");
    System.out.println("Сортировка покупателей по алфавиту:");
        for (int j = 0; j < customers.length; j++) {
            for (int i = j + 1; i < customers.length; i++) { 
                if (customers[i].getSecondName().compareTo(customers[j].getSecondName()) < 0) { 
                    Object t = customers[j];
                    customers[j] = customers[i];
                    customers[i] = (Customer) t;
                } 
            }  
            System.out.println(customers[j]);
        }
    }
    //Выборка покупателей по номеру карты
    public static void selectByCreditCartNumber(Customer[] customers, long firstCartNumber , long secondCartNumber){
        System.out.println(" ");
        System.out.println("Список покупателей с номером карты в диапазоне от " + firstCartNumber + " до " + secondCartNumber + ": ");
        for (int i = 0; i < customers.length; i++){ 
            if(customers[i].getCreditCartNumber() >= firstCartNumber && customers[i].getCreditCartNumber() <= secondCartNumber)    
                System.out.println(customers[i].toString());
        }
    }
    //Выборка пациентов по диагносу
    public static void selectByDiagnosis(Patient[] patients, String diagnosis){
        System.out.println(" ");
        System.out.println("Список пациентов с диагносом: " + diagnosis);
        for (int i = 0; i < 10; i++){ 
            if(patients[i].getDiagnosis().equals(diagnosis))    
                System.out.println(patients[i].toString());
        }
    }
    //Выборка пациентов, номер медицинской карты которых находится в за-данном интервале
    public static void selectByMedicalRecordNumber(Patient[] patients, int firstMedicalRecordNumber , int secondMedicalRecordNumber){
        System.out.println(" ");
        System.out.println("Список пациентов с номером карты в диапазоне от " + firstMedicalRecordNumber + " до " + secondMedicalRecordNumber + ": ");
        for (int i = 0; i < patients.length; i++){ 
            if(patients[i].getMedicalRecordNumber() >= firstMedicalRecordNumber && patients[i].getMedicalRecordNumber() <= secondMedicalRecordNumber)    
                System.out.println(patients[i].toString());
        }
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
        System.out.println("список абитуриентов, у которых средний балл и выше:");
        int[] arr = null;
        for (int i = 0; i < abiturients.length; i++) {
            int summ = 0;
            arr = new int[abiturients[i].getRating().length];
            for (int j = 0; j < abiturients[i].getRating().length; j++){
                summ += abiturients[i].getRating()[j];
                
            }
            arr[i] = summ;
        }
        for (int i = 0; i < arr.length; i++) {
            // Массив просматривается с конца до
            // позиции i и "легкие элементы всплывают"
            for (int j = arr.length - 1; j > i; j--) {
                // Если соседние элементы расположены
                // в неправильном порядке, то меняем
                // их местами
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;}
            }
        }
        int[] array = new int[abiturients.length];
        System.arraycopy(arr, 0, array, 0, number);
        
          
                    
        
            
           
    }
    
}
    
    
    
    
    
    
    

    
    

