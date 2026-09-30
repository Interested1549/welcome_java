package codexl1.phonemanage;

public class phone_storage {

    public static void main(String[] args) {
        //phone 1
        phone_print phone1 = new phone_print();
        phone1.manufacturer = "Apple";
        phone1.model = "iPhone 12";
        phone1.price = 799.99;
        phone1.storage = 128;
        phone1.support5g = true;
        phone1.introduce();
        System.out.println("-----------------------------");
        //phone 2
        phone_print phone2 = new phone_print();
        phone2.manufacturer = "Samsung";
        phone2.model = "Galaxy S20 FE";
        phone2.price = 699.99;
        phone2.storage = 256;
        phone2.support5g = false;
        phone2.introduce();
        System.out.println("-----------------------------");
        //phone 3
        phone_print phone3 = new phone_print();
        phone3.manufacturer = "Xiaomi";
        phone3.model = "Redmi Note 10";
        phone3.price = 499.99;
        phone3.storage = 128;
        phone3.support5g = true;
        phone3.introduce();
    }

}
