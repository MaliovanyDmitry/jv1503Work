
package uits.jv1503.task_0.book;

public class App {
    public static void main(String[] args) {
        Book[] books = initBooks();
        getBooksByAutor(books, "authorccc");
        getBooksByPublishingHouse(books, "publishingHousehhh");
        getBooksAfterYear(books, 1990);
    }

    public static Book[] initBooks(){
    Book[] books = new Book[10];
    books[0] = new Book(0, "bookNamefgd", "authoraaa", "publishingHouseddd", 2015, 500, 200, "bindingTypettt");
    books[1] = new Book(1, "bookNamedgfg", "authorccc", "publishingHousehhh", 2015, 300, 456, "bindingTypeyyy");
    books[2] = new Book(2, "bookNameadf", "authorbbb", "publishingHouseddd", 1990, 100, 678, "bindingTypeiii");
    books[3] = new Book(3, "bookNametuj", "authoraaa", "publishingHouseuuu", 1980, 200, 543, "bindingTypettt");
    books[4] = new Book(4, "bookNameae", "authorccc", "publishingHouseddd", 2000, 678, 897, "bindingTypeiii");
    books[5] = new Book(5, "bookNamesryj", "authorccc", "publishingHouseddd", 1965, 543, 560, "bindingTypeyyy");
    books[6] = new Book(6, "bookNameaerg", "authoraaa", "publishingHouseuuu", 2005, 345, 430, "bindingTypettt");
    books[7] = new Book(7, "bookNameaeth", "authorbbb", "publishingHousehhh", 1950, 123, 230, "bindingTypeiii");
    books[8] = new Book(8, "bookNamej", "authoraaa", "publishingHouseddd", 1975, 876, 456, "bindingTypettt");
    books[9] = new Book(9, "bookNamefg", "authorbbb", "publishingHousehhh", 2010, 450, 320, "bindingTypeyyy");
    return books;
    }
    
    public static void printBooks(Book[] books){
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }
    }
    
    public static void getBooksByAutor(Book[] books, String autor){
        System.out.println("a)  список книг заданного автора;" + autor);
        for (int i = 0; i < books.length ; i++) {
            if (books[i].getAuthor().equals(autor) ) {
                System.out.println(books[i].toString());
            }
        }
    }
    
    public static void getBooksByPublishingHouse(Book[] books, String publishingHouse){
        System.out.println(" ");
        System.out.println("b)  список книг, выпущенных заданным издательством;" + publishingHouse);
        for (int i = 0; i < books.length ; i++) {
            if (books[i].getPublishingHouse().equals(publishingHouse) ) {
                System.out.println(books[i].toString());
            }
        }
    }
    
    public static void getBooksAfterYear(Book[] books, int yearOfPublishing){
        System.out.println(" ");
        System.out.println("c)  список книг, выпущенных после заданного года." + yearOfPublishing);
        for (int i = 0; i < books.length; i++) {
            if (books[i].getYearOfPublishing() > yearOfPublishing) {
                System.out.println(books[i].toString());
            }
        }
    }
}