package PizzaTopping;

import java.util.ArrayList;
import java.util.List;

abstract class Pizza {
    protected List<String> Toppings;

    public Pizza() {
        Toppings = new ArrayList<>();
    }

    public void addTopping(String topping) {
        Toppings.add(topping);
    }

    public abstract double calculateCost();
}
