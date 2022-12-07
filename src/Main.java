public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Car myCar1 = new Car();
//        Car myCar2 = new Car(50);
//        System.out.println(myCar.speed);
//        myCar1.displaySpeed();
//        myCar2.displaySpeed();

        AirPurifier xiaomi = new AirPurifier("John");
        System.out.println(xiaomi.model);
        System.out.println(xiaomi.isOn);
        System.out.println(xiaomi.aqi);

        AirPurifier sharp = new AirPurifier("Sarah", 1);
        System.out.println(sharp.aqi);
    }
}