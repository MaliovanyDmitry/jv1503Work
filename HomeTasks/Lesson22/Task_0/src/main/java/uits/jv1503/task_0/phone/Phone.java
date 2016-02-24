
package uits.jv1503.task_0.phone;

public class Phone {
    
    //Phone: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, 
//Дебет, Кредит, Время городских и междугородных разговоров.
    private int id;
    private String secondName;
    private String name;
    private String patronymic;
    private String adress;
    private long creditCartNumber;
    private int debit;
    private int kredit;
    private int sityCalls;
    private int longDistanceCalls;

    public Phone() {
    }

    public Phone(int id, String secondName, String name, String patronymic, String adress, long creditCartNumber, int debit, int kredit, int sityCalls, int longDistanceCalls) {
        this.id = id;
        this.secondName = secondName;
        this.name = name;
        this.patronymic = patronymic;
        this.adress = adress;
        this.creditCartNumber = creditCartNumber;
        this.debit = debit;
        this.kredit = kredit;
        this.sityCalls = sityCalls;
        this.longDistanceCalls = longDistanceCalls;
    }

    @Override
    public String toString() {
        return "Phone{" + "id=" + id + ", secondName=" + secondName + ", name=" + name + ", patronymic=" + patronymic + ", adress=" + adress + ", creditCartNumber=" + creditCartNumber + ", debit=" + debit + ", kredit=" + kredit + ", sityCalls=" + sityCalls + ", longDistanceCalls=" + longDistanceCalls + '}';
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

    public int getDebit() {
        return debit;
    }

    public int getKredit() {
        return kredit;
    }

    public int getSityCalls() {
        return sityCalls;
    }

    public int getLongDistanceCalls() {
        return longDistanceCalls;
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

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public void setKredit(int kredit) {
        this.kredit = kredit;
    }

    public void setSityCalls(int sityCalls) {
        this.sityCalls = sityCalls;
    }

    public void setLongDistanceCalls(int longDistanceCalls) {
        this.longDistanceCalls = longDistanceCalls;
    }
    
    
    
    
}
