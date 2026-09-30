package car;

public class identify {
    public String manufacturer;
    public double price;
    public boolean isElectric;

    public identify() {
        manufacturer = "Generic";
        price = 999.0;
        isElectric = false;
    }

    public void introduce(String manufacturer, double price, boolean isElectric) {
        System.out.println("Car Manufacturer: " + manufacturer);
        System.out.println("Price: $" + price);
        System.out.println("Electric Car ?: " + isElectric);
    }

}
