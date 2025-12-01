package strategy;

import factory.Sneakers;

public class Purchase {
    private Sneakers sneakers;
    private ShippingStrategy strategy;

    public Purchase(Sneakers sneakers) {
        this.sneakers = sneakers;
    }

    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateFreight(double distance){
        return strategy.calculate(distance);
    }
}
