
package uits.jv1503.task_0.customer;

import java.util.Comparator;

public class Customer implements Comparable {

   
    private int id;
    private String secondName;
    private String name;
    private String patronymic;
    private String adress;
    long creditCartNumber;
    int bankAkkauntNumber;

    public Customer() {
    }

    public Customer(int id, String secondName, String name, String patronymic, String adress, long creditCartNumber, int bankAkkauntNumber) {
        this.id = id;
        this.secondName = secondName;
        this.name = name;
        this.patronymic = patronymic;
        this.adress = adress;
        this.creditCartNumber = creditCartNumber;
        this.bankAkkauntNumber = bankAkkauntNumber;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", secondName=" + secondName + ", name=" + name + ", patronymic=" + patronymic + ", adress=" + adress + ", creditCartNumber=" + creditCartNumber + ", bankAkkauntNumber=" + bankAkkauntNumber + '}';
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

    public long getCreditCartNumber() {
        return creditCartNumber;
    }

    public int getBankAkkauntNumber() {
        return bankAkkauntNumber;
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

    public void setCreditCartNumber(long creditCartNumber) {
        this.creditCartNumber = creditCartNumber;
    }

    public void setBankAkkauntNumber(int bankAkkauntNumber) {
        this.bankAkkauntNumber = bankAkkauntNumber;
    }

    static Comparator<Customer> sort = new Comparator<Customer>() {
        @Override
        public int compare(Customer o1, Customer o2) {
            return o1.getSecondName().compareTo(o2.getSecondName());
        }
        };

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    

    
}
