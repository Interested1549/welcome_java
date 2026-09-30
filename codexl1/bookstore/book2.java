package bookstore;

public class book2 {
    public static void main(String[] args) {
        Publish book2 = new Publish();
        book2.title = "The Great Adventure";
        book2.author = "John Smith";
        book2.price = 9.99;
        book2.quantity = 50;
        book2.ispublished = true;
        book2.introduce();
    }

}