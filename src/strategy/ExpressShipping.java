package strategy;

public class ExpressShipping implements ShippingStrategy {
    @Override
    public double calculate(double distance) {
        return distance * 1.2;
    }
}
