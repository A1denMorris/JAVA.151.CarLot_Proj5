public class CarTester {
    public static void main(String[] args) {
        Car newCar1 = new Car("2012 Subaru Impreza Outback Sport", 205678, 23, 1200.99, 1500.99);
        Car newCar2 = new Car("2008 VW Rabbit", 186906, 21, 1345.43, 1565.65);

        testsellCar(newCar1);
        testComparisons(newCar1, newCar2);

    }
    public static void testsellCar(Car car) {
        System.out.println(car + "\nAfter sellCar()\n");
        car.sellCar();
        System.out.println(car);
    }

    public static void testComparisons(Car car1, Car car2) {
        System.out.print("\nCar1 -> Car2\n\n");
        System.out.println("Compare MPG:\n" + car1.compareMPG(car2));
        System.out.println("Compare Mileage:\n" + car1.compareMiles(car2));
        System.out.println("Compare Price:\n" + car1.comparePrice(car2));

        System.out.print("\nCar2 -> Car1\n\n");
        System.out.println("Compare MPG:\n" + car2.compareMPG(car1));
        System.out.println("Compare Mileage:\n" + car2.compareMiles(car1));
        System.out.println("Compare Price:\n" + car2.comparePrice(car1));
    }
}
