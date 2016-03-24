package com.mycompany.stringtask;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//flugergehaimer
public class Session {
    static String res = "";
    Connection c;

    public Session(Connection c) {
        this.c = c;
    }

    public Session() {
    }
    
    public class SQLQuerry {

        public SQLQuerry() {
        }
        
        void executeQuerry(){
            Scanner sc = new Scanner(System.in);
            
            boolean finish = false;
        while(!finish){
             System.out.println("Выберите тип запроса:\n" + 
                    "1 - SELECT\n" + 
                    "2 - INSERT\n" +
                    "3 - UPDATE\n" +
                    "4 - DELETE\n" + 
                     "0 - выход");
            int operation;
            try{
                operation = Integer.parseInt(sc.next());
                switch(operation){
                    case 0:{
                        finish = true;
                    }break;
                    case 1:{
                       selectFrom();
                        System.out.println("Использовать предикат? y/n");
                        if ("y".equals(sc.next())) {
                           where(); 
                        } finish = true;
                    }break;
                    case 2:{
                        insertInto();
                        System.out.println("Использовать предикат? y/n");
                        if ("y".equals(sc.next())) {
                           where(); 
                        }finish = true;
                    }break;
                    case 3:{
                        updateSet();
                        System.out.println("Использовать предикат? y/n");
                        if ("y".equals(sc.next())) {
                           where(); 
                        }finish = true;
                    }break;
                    case 4:{
                        deleteFrom();
                        System.out.println("Использовать предикат? y/n");
                        if ("y".equals(sc.next())) {
                           where(); 
                        }finish = true;
                    }break;
                    default:{
                        System.out.println("Неверный код операции, повторите снова.");
                    }
                }
            }catch(Exception ex){
                System.out.println("Неверный код операции, повторите снова.");
            }
        }
        }
        void selectFrom(){
            String fildNames = "";
            String tableNames = "";
            Scanner sc = new Scanner(System.in);
            String[] fildsArray = new String[10];
            String[] tablesArray = new String[10];

            for (int i = 0; i < fildsArray.length; i++) {
                System.out.println("Введите поле или 0 для выхода:");
                String str = sc.next();
                if (str != null && !"0".equals(str)) {
                    fildsArray[i] = str;
                } else if ("0".equals(str)){
                     break; 
                }
            }
            for (int i = 0; i < tablesArray.length; i++) {
                System.out.println("Введите название таблицы или 0 для выхода:");
                String str = sc.next();
                if (str != null && !"0".equals(str)) {
                    tablesArray[i] = str;
                } else if ("0".equals(str)){
                     break; 
                } 
            }       
            for (String fildsArray1 : fildsArray) {
                if (fildsArray1 != null) {
                    fildNames += (fildsArray1 + ", ");
                } else { 
                    fildNames = fildNames.substring(0, fildNames.length()-2);
                    break;
                }
            }
            for (String tablesArray1 : tablesArray) {
                if (tablesArray1 != null) {
                    tableNames += (tablesArray1 + ", ");
                } else { 
                    tableNames = tableNames.substring(0, tableNames.length()-2);
                    break;
                }
            }
            res = "SELECT " + fildNames + " FROM " + tableNames;
        }
        
        void insertInto(){
            List<String> fields = new ArrayList<>();
            List<String> values = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Введите название таблицы:");
            String table = sc.next();
            for (int i = 0; i < 20; i++) {
                System.out.println("Введите название задаваемого поля или 0 для выхода:");
                String field = sc.next();
                if (field != null && !"0".equals(field)) {
                    fields.add(field);
                    System.out.println("Введите значение соответствующее полю " + field + ":");
                    String value = sc.next();
                    values.add(value);
                } else if ("0".equals(field)){
                    fields.add("0");
                    break; 
                }
            }
            res = "INSERT INTO "+table+"(";
            for (int i = 0; i < fields.size(); i++) {
                if (!"0".equals(fields.get(i))) {
                    res += fields.get(i) + ", ";    
                } else {
                
                res = res.substring(0, res.length()-2);
                break;
                }
            }
            res += ") values(";
                    
            for (int i = 0; i < fields.size()-1; i++) {
                    res += "'" + values.get(i) + "', ";   
            }
            res = res.substring(0, res.length()-2) + ")";
        }
        
        void updateSet(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите название таблицы:");
            String tableName = sc.next();
            System.out.println("Введите имя изменяемого поля:");
            String fildName = sc.next();
            System.out.println("Введите новое значение изменяемого поля:");
            String newValue= sc.next();
            res = "UPDATE " + tableName + " SET " + fildName + " = " + newValue;
        }
        
        void deleteFrom(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите название таблицы:");
            String tableName = sc.next();
            res = "DELETE FROM " + tableName;
        }
        
        void where(){
            Scanner sc = new Scanner(System.in);
            boolean finish = false;
            List<String> ifs = new ArrayList<>();
            String str =" where ";
            
            while(!finish){
            System.out.println("Введите имя сравниваемого поля или 0 для выхода:");
            String temp = sc.next();
                if ("0".equals(temp)) {
                    finish = true;
                }
            //str += temp;
            System.out.println("Выберите тип сравнения:\n" +
                    "1 - \"=\";\n2 - \">\"\n3 - \"<\"\n4 - \"<=\"\n5 - \">=\"\n0 - выход\n");
            int operation;
            try{
                operation = Integer.parseInt(sc.next());
                switch(operation){
                    case 0:{
                        finish = true;
                    }
                    case 1:{
                        System.out.println("Введите значение с которым сравнивается поле:");
                        str += temp + " = " + sc.next();
                        System.out.println("Необходим дополнительный предикат? y/n"); 
                        if ("y".equals(sc.next())) {
                            str+=changeTypePredicate();
                        } else {finish = true;
                        }
                    }break;
                    case 2:{
                        System.out.println("Введите значение с которым сравнивается поле:");
                        str += temp + " > " + sc.next();
                        System.out.println("Необходим дополнительный предикат? y/n"); 
                        if ("y".equals(sc.next())) {
                            str+=changeTypePredicate();
                        }else {finish = true;
                        }
                    }break;
                    case 3:{
                        System.out.println("Введите значение с которым сравнивается поле:");
                        str += temp + " < " + sc.next();
                        System.out.println("Необходим дополнительный предикат? y/n"); 
                        if ("y".equals(sc.next())) {
                            str+=changeTypePredicate();
                        }else {finish = true;
                        }
                    }break;
                    case 4:{
                        System.out.println("Введите значение с которым сравнивается поле:");
                        str += temp + " <= " + sc.next();
                        System.out.println("Необходим дополнительный предикат? y/n"); 
                        if ("y".equals(sc.next())) {
                            str+=changeTypePredicate();
                        }else {finish = true;
                        }
                    }break;
                    case 5:{
                        System.out.println("Введите значение с которым сравнивается поле:");
                        str += temp + " >= " + sc.next();
                        System.out.println("Необходим дополнительный предикат? y/n"); 
                        if ("y".equals(sc.next())) {
                            str+=changeTypePredicate();
                        } else {finish = true;
                        }
                    }break;
                    default:{
                        System.out.println("Неверный код операции, повторите снова.");
                    }
                }
            }catch(Exception ex){
                System.out.println("Неверный код операции, повторите снова.");
            }
        }
            
        res+=str;    
    }
        String changeTypePredicate(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Какой оператор использовать? AND/OR");

            boolean finish = false;
            while(true){
            System.out.println("Какой оператор использовать?\n" + 
                    "1 - AND\n + 2 - OR");
            int operation;
            try{
                operation = Integer.parseInt(sc.next());
                switch(operation){
                    case 1:{
                        return " AND ";
                    }
                    case 2:{
                       return " OR "; 
                    }
                    default:{
                        System.out.println("Неверный код операции, повторите снова.");
                    }
                }
            }catch(Exception ex){
                System.out.println("Неверный код операции, повторите снова.");
            }
        }}}
}


