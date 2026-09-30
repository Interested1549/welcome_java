package bookstore;

public class book1 {
    public static void main(String[] args) {
        Publish book1 = new Publish();
        book1.title = "Anna Story";
        book1.author = "Anna Johnson";
        book1.price = 1.99;
        book1.quantity = 20;
        book1.ispublished = true;
        book1.introduce();
    }

}
