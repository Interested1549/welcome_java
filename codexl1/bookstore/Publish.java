package bookstore;


public class Publish {
    public String title;
    public String author;
    public double price;
    public int quantity;
    public boolean ispublished;
    public void introduce(){
        System.out.println("Book name: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Published ?: " + ispublished);
    }


}
