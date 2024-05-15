package PizzaTopping;

public class VegPizza extends Pizza {
    @Override
    public double calculateCost() {
        double BaseCost = 100.0;
        double ToppingCost = Toppings.size() * 20.5;
        double TotalCost= BaseCost + ToppingCost;
        return TotalCost;
    }
}
