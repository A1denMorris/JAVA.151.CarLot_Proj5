import java.util.ArrayList;

public class CarLot {
    ArrayList<Car> inventory;

    // Constructor Methods
    CarLot() {
        this.inventory = new ArrayList<Car>();
    }
    CarLot(ArrayList<Car> inv) {
        this.inventory = inv;
    }

    // Accessor Methods
    public Car findCarByIdentifier(String identifier) {
        for (Car car: inventory) {
            if (car.get_ID().toUpperCase() == identifier.toUpperCase().strip()) {
                return car;
            }
        } return null;
    }

    public ArrayList<Car> getCarsInOrderOfEntry() {
        ArrayList<Car> inventoryCopy = new ArrayList<Car>(this.inventory);
        return inventoryCopy;
    }


    // Returns and ArrayList that can be accessed to get the car or cars with the best mpg

//    public ArrayList<Car> getCarWithBestMPG() {
//        ArrayList<Car> bestMPG = new ArrayList<Car>();
//        Car carWithBestMPG = inventory.get(0);
//        for (Car car: inventory) {
//            if (carWithBestMPG.getMpg() < car.getMpg()) {
//                carWithBestMPG = car;
//            } else if (carWithBestMPG.getMpg() == car.getMpg()) {
//                bestMPG.add(car);
//            }
//        }
//        bestMPG.add(carWithBestMPG);
//        return bestMPG;
//    }

    public Car getCarWithBestMPG() {

        Car carWithBestMPG = this.inventory.get(0);
        for (Car car: inventory) {
            if (carWithBestMPG.getMpg() < car.getMpg()) {
                carWithBestMPG = car;
            }
        }
        return carWithBestMPG;
    }

    public Car getCarWithHighestMileage() {

        Car carHighestMileage = this.inventory.get(0);
        for (Car car: inventory) {
            if (carHighestMileage.getMileage() < car.getMileage()) {
                carHighestMileage = car;
            }
        }
        return carHighestMileage;
    }

    double getAverageMpg() {
        double total = 0;
        int count = 0;

        for (Car car: inventory) {
            count += 1;
            total += car.getMpg();
        }

        return total / count;
    }

    double getTotalProfit() {
        double total = 0;

        for (Car car: inventory) {
            if (car.isSold()) {
                total += car.getProfit();
            }
        }

        return total;
    }

    public String toString() {
        String str = "";

        for (Car car: inventory) {
            str += car.toString();
            str += "\n\n";
        }
        return str;
    }


}

