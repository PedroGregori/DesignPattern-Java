package strategy;

public class CheapShipping implements ShippingStrategy {
    @Override
    public double calculate(double distance) {
        return distance * 0.5;
    }
}
