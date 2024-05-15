package PizzaTopping;

public class NonVegPizza extends Pizza {
    @Override
    public double calculateCost() {
        double BaseCost = 170.0;
        double ToppingCost = Toppings.size() * 95.5;
        double TotalCost = BaseCost + ToppingCost;
        return TotalCost;
    }
}
