package car;

public class carstore {
    public static void main(String[] args) {
        //car 1
        identify car1 = new identify();
        car1.manufacturer = "Tesla";
        car1.price = 49999.99;
        car1.isElectric = true;
        System.out.println("Car 1:");
        car1.introduce(car1.manufacturer, car1.price, car1.isElectric);
        System.out.println("-----------------------------");
        //car 2
        identify car2 = new identify();
        car2.manufacturer = "Ford";
        car2.price = 29999.99;
        car2.isElectric = false;
        System.out.println("Car 2:");
        car2.introduce(car2.manufacturer, car2.price, car2.isElectric);
        System.out.println("-----------------------------");
        //car 3
        identify car3 = new identify();
        System.out.println("Car 3:");
        car3.introduce(car3.manufacturer, car3.price, car3.isElectric);
    }

}
