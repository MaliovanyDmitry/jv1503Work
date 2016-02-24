
package uits.jv1503.task_0.patient;

import uits.jv1503.task_0.patient.Patient;

public class App {
    
    public static void main(String[] args) {
        Patient[] patients = initPatients();
        selectByDiagnosis(patients, "a");
        selectByMedicalRecordNumber(patients, 40000000, 90000000);
    }
    public static Patient[] initPatients(){
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
        return patients;
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
