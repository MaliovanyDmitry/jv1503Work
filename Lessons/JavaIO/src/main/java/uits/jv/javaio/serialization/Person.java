package uits.jv.javaio.serialization;

import java.io.Serializable;

public class Person implements Serializable{
    private String name;
    private int age;
    private Gender gender;

    public enum Gender {
        MALE,FEMALE;
        public static Gender byOrder(int ord){
            return Gender.values()[ord];
        }
    }

    public Person() {
    }

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", gender=" + gender + '}';
    }
    
    
    
}
