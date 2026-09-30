package headphone;

public class hpstore {
    public static void main(String[] args) {
        //headphone 1
        headphone hp1 = new headphone();
        hp1.manufacturer = "Sony";
        hp1.price = 199.99;
        hp1.wireless = true;
        System.out.println("Headphone 1:");
        System.out.println("Manufacturer: " + hp1.manufacturer);
        System.out.println("Price: $" + hp1.price);
        System.out.println("Wireless: " + hp1.wireless);
        System.out.println("-----------------------------");
        //headphone 2
        headphone hp2 = new headphone("Bose", 299.99, true);
        System.out.println("Headphone 2:");
        System.out.println("Manufacturer: " + hp2.manufacturer);
        System.out.println("Price: $" + hp2.price);
        System.out.println("Wireless: " + hp2.wireless);
        //headphone 3
        System.out.println("-----------------------------");
        headphone hp3 = new headphone();
        System.out.println("Headphone 3:");
        System.out.println("Manufacturer: " + hp3.manufacturer);
        System.out.println("Price: $" + hp3.price);
        System.out.println("Wireless: " + hp3.wireless);
    }

}
