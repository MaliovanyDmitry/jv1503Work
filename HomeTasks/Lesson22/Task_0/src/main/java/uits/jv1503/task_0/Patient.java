
package uits.jv1503.task_0;

public class Patient {
    
    private int id;
    private String secondName;
    private String name;
    private String patronymic;
    private String adress;
    private long phone;
    private int medicalRecordNumber;
    private String diagnosis;

    public Patient() {
    }

    public Patient(int id, String secondName, String name, String patronymic, String adress, long phone, int medicalRecordNumber, String diagnosis) {
        this.id = id;
        this.secondName = secondName;
        this.name = name;
        this.patronymic = patronymic;
        this.adress = adress;
        this.phone = phone;
        this.medicalRecordNumber = medicalRecordNumber;
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", secondName=" + secondName + ", name=" + name + ", patronymic=" + patronymic + ", adress=" + adress + ", phone=" + phone + ", medicalRecordNumber=" + medicalRecordNumber + ", diagnosis=" + diagnosis + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void setMedicalRecordNumber(int medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAdress() {
        return adress;
    }

    public long getPhone() {
        return phone;
    }

    public int getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }
    
    

}
