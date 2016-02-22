
package uits.jv1503.task_0;

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
        
    }
    
    
    
    
    
}    
    

    
    

