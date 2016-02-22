
package uits.jv1503.task_0;

import java.util.Arrays;

public class Abiturient {
    
    private int id;
    private String secondName;
    private String name;
    private String patronymic;
    private String adress;
    private long phone;
    private byte[] rating;

    public Abiturient() {
    }

    public Abiturient(int id, String secondName, String name, String patronymic, String adress, long phone, byte[] rating) {
        this.id = id;
        this.secondName = secondName;
        this.name = name;
        this.patronymic = patronymic;
        this.adress = adress;
        this.phone = phone;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Abiturient{" + "id=" + id + ", secondName=" + secondName + ", name=" + name + ", patronymic=" + patronymic + ", adress=" + adress + ", phone=" + phone + ", rating=" + Arrays.toString(rating) + '}';
    }

        
    
    public int getId() {
        return id;
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

    public byte[] getRating() {
        return rating;
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

    public void setRating(byte[] rating) {
        this.rating = rating;
    }
    
    
    
}
