
package uits.jv1503.task_0;

import java.util.Date;

public class app {
    
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
    }    
    public static void selectByFaculty(Student[] students, String faculty){
        System.out.println("Список студентов факультета " + faculty + ":");
        for (int i = 0; i < 10; i++){ 
            if(students[i].getFaculty().equals(faculty))    
                System.out.println(students[i].toString());
            
        }
    }

    public static void selectByFacultyAndCourse(Student[] students, String faculty, int course){
        System.out.println(" ");
        System.out.println("Список студентов факультета " + faculty + ","+ course +"-го курса:");
        for (int i = 0; i < 10; i++){ 
            if(students[i].getFaculty().equals(faculty) && students[i].getCourse() == course)    
                System.out.println(students[i].toString());
        }
    }
    public static void selectByYoB(Student[] students, int yob){
        System.out.println(" ");
        System.out.println("Список студентов факультета, родившихся после " + yob + " года:");
        for (int i = 0; i < 10; i++){ 
            if(students[i].getYob() >= yob)    
                System.out.println(students[i].toString());
        }
    }
    public static void selectByGroup(Student[] students, String group){
        System.out.println(" ");
        System.out.println("Список студентов группы: " + group);
        for (int i = 0; i < 10; i++){ 
            if(students[i].getGroup().equals(group))    
                System.out.println(students[i].toString());
        }
    }
    
    
    
    
    
//        System.out.println("Список студентов факультета AT:");
//        for (int i = 0; i < 10; i++){ 
//            if(students[i].faculty == "AT")    
//                System.out.println(students[i].toString());
//        }
//        System.out.println("Список студентов факультета PO:");
//        for (int i = 0; i < 10; i++){
//            if(students[i].faculty == "PO")
//                System.out.println(students[i].toString()); 
//        }
//        System.out.println("Список студентов факультета EK:");
//        for (int i = 0; i < 10; i++){ 
//            if(students[i].faculty == "EK")
//                System.out.println(students[i].toString()); 
//        }
//        System.out.println("Список студентов 1 курса:");
//        for (int i = 0; i < 10; i++){ 
//            if(students[i].course == 1)
//                System.out.println(students[i].toString()); 
//        }
//        System.out.println("Список студентов 2 курса:");
//        for (int i = 0; i < 10; i++){ 
//            if(students[i].course == 2)
//                System.out.println(students[i].toString()); 
//        }
//        System.out.println("Список студентов 3 курса:");
//        for (int i = 0; i < 10; i++){ 
//            if(students[i].course == 3)
//                System.out.println(students[i].toString()); 
//        }
//        System.out.println("Список студентов 4 курса:");
//        for (int i = 0; i < 10; i++){ 
//            if(students[i].course == 4)
//                System.out.println(students[i].toString()); 
//        }
        

            

            
            
        
        
        
        
    }
    
}
