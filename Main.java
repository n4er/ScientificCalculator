// Encapsulation & Inheritance
class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void drive() {
        System.out.println(model + " is driving.");
    }
}

class ElectricCar extends Car {
    public ElectricCar(String model) {
        super(model);
    }

    @Override
    public void drive() {
        System.out.println(getModel() + " is driving silently.");
    }
}

// Main
public class Main {
    public static void main(String[] args) {
        Car myCar = new ElectricCar("Tesla");
        myCar.drive();  // Output: Tesla is driving silently.
    }
}
