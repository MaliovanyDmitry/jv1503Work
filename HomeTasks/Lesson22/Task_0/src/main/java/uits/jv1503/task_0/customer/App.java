
package uits.jv1503.task_0.customer;
public class App {
    public static void main(String[] args) {
    
    Customer[] customers = initCustomers();
    sortBySecondName(customers);
    selectByCreditCartNumber(customers, 3333333333333333L, 6666666666666666L);
    }
    public static Customer[] initCustomers(){
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
        return customers;
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
        }
        printCustomers(customers);
    }
    public static void printCustomers(Customer[] customers){
        for (Customer customer : customers) {
            System.out.println(customer);
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
}