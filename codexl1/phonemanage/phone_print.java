package codexl1.phonemanage;

public class phone_print {
    public String manufacturer;
    public String model;
    public double price;
    public int storage;
    public boolean support5g;
    public void introduce(){
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Supports 5G ?: " + support5g);
    }


}