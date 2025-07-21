

abstract class paymentMethod {
    private String name;
    public paymentMethod (String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public abstract void pay (double amount);

}

// CreditCard class demonstrating Inheritance and Polymorphism
class creditCard extends paymentMethod {
    public creditCard(String name) {
        super(name);
    } //helo

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card: " + getName());
    }
}

// Cash class demonstrating Inheritance and Polymorphism
class Cash extends paymentMethod {
    public Cash(String name) {
        super(name);
    }
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Cash: " + getName());
    }
}

// Main class
public class simplePaymentSystem {
    public static void main(String[] args) {
        paymentMethod credit = new creditCard("Visa");
        paymentMethod cash = new Cash("Wallet");

        // Polymorphism in action
        credit.pay(50.0);
        cash.pay(20.0);
    }
}