
package uits.jv1503.task_0.book;

public class Book {
    
    private int id;
    private String bookName;
    private String author;
    private String publishingHouse;
    private int yearOfPublishing;
    private int numberOfPages;
    private int price;
    private String bindingType;

    public Book() {
    }

    public Book(int id, String bookName, String author, String publishingHouse, int yearOfPublishing, int numberOfPages, int price, String bindingType) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", bookName=" + bookName + ", author=" + author + ", publishingHouse=" + publishingHouse + ", yearOfPublishing=" + yearOfPublishing + ", numberOfPages=" + numberOfPages + ", price=" + price + ", bindingType=" + bindingType + '}';
    }

    public int getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getPrice() {
        return price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }
    
    
    
}
