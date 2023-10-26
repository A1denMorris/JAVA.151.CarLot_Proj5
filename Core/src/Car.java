public class Car {
    String id;
    int mileage;
    int mpg;
    double cost;
    double salesPrice;
    boolean sold;
    double priceSold;
    double profit;

    Car() {
        this.id = "New_Car";
        this.mileage = 0;
        this.mpg = 0;
        this.cost = 0;
        this.salesPrice = 0;
    }

    Car(String id, int mileage, int mpg, double cost, double salesPrice) {
        this.id = id;
        this.mileage = mileage;
        this.mpg = mpg;
        this.cost = cost;
        this.salesPrice = salesPrice;

    }

    // Accessor Methods
    String get_ID() {
        return this.id;
    }
    int getMileage() {
        return this.mileage;
    }
    int getMpg() {
        return this.mpg;
    }
    double getCost() {
        return this.cost;
    }
    double getSalesPrice() {
        return this.salesPrice;
    }
    boolean isSold() {
        return this.sold;
    }
    double getPriceSold() {
        return this.priceSold;
    }
    double getProfit() {
        return this.profit;
    }

    public String toString() {
        String str = "Car:\t" + this.id + "\nMileage:\t" + this.mileage + "\nMPG:\t" + this.mpg +
                "\nSold:\t" + this.sold + "\nCost\t" + this.cost + "\nSelling Price:\t" + this.salesPrice +
                "\nSold For:\t" + this.priceSold + "\nProfit\t" + this.profit;
        return str;
    }

    // Comparison Methods
    public int compareMPG(Car other_car) {
        if (this.mpg < other_car.getMpg()) {
            return -1;
        } else if (this.mpg > other_car.getMpg()) {
            return 1;
        } else {
            return 0;
        }
    }

    public int compareMiles(Car other_car) {
        if (this.mileage < other_car.getMileage()) {
            return -1;
        } else if (this.mileage > other_car.getMileage()) {
            return 1;
        } else {
            return 0;
        }
    }

    public int comparePrice(Car other_car) {
        if (this.cost < other_car.getCost()) {
            return -1;
        } else if (this.cost > other_car.getCost()) {
            return 1;
        } else {
            return 0;
        }
    }

    // Mutator Methods
    public void changeID(String newID) {
        this.id = newID;
    }
    public void changeMileage(int newMileage) {
        this.mileage = newMileage;
    }
    public void adjustMPG(int newMPG) {
        this.mpg = newMPG;
    }
    public void adjustCost(double newCost) {
        this.cost = newCost;
    }
    public void adjustPrice(double newPrice) {
        this.salesPrice = newPrice;
    }
    public void sellCar() {
        this.sold = true;
        this.priceSold = this.salesPrice;
        this.profit = this.salesPrice - this.cost;
    }
}
