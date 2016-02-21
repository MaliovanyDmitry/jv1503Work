package uits.jv1503.task_0;

public class Student {
    
    private int id;
    private String secondName;
    private String name;
    private String patronymic;
    private int yob;
    private String adress;
    private int phone;
    private String faculty;
    private int course;
    private String group;
    

    public Student() {
    }

    public Student(int id, String secondName, String name, String patronymic, int yob, String adress, int phone, String faculty, int course, String group) {
        this.id = id;
        this.secondName = secondName;
        this.name = name;
        this.patronymic = patronymic;
        this.yob = yob;
        this.adress = adress;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", secondName=" + secondName + ", name=" + name + ", patronymic=" + patronymic + ", yob=" + yob + ", adress=" + adress + ", phone=" + phone + ", faculty=" + faculty + ", course=" + course + ", group=" + group + '}';
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

    public int getYob() {
        return yob;
    }

    public String getAdress() {
        return adress;
    }

    public int getPhone() {
        return phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
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

    public void setYob(int yob) {
        this.yob = yob;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(String group) {
        this.group = group;
    }


    
    
    




    
    
    
    
    
    
    
}
