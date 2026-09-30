package headphone;

public class headphone {
    public String manufacturer;
    public double price;
    public boolean wireless;

    public headphone() {
        manufacturer = "Generic";
        price = 0.0;
        wireless = false;
    }

    public headphone(String manufacturer, double price, boolean wireless) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.wireless = wireless;
    }

}
