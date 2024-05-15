package PizzaTopping;

public class Main {
    public static void main(String[] args) {
        VegPizza vegPizza = new VegPizza();
        vegPizza.addTopping("Mushrooms");
        vegPizza.addTopping("Olives");
        System.out.println("Cost of cheese pizza: " + vegPizza.calculateCost()+" Tk");

        NonVegPizza nonVegPizza = new NonVegPizza();
        nonVegPizza.addTopping("Extra cheese");
        System.out.println("Cost of pepperoni pizza: " + nonVegPizza.calculateCost()+" Tk");
    }
}
