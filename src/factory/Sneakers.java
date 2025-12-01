package factory;

public class Sneakers {
    private String brand;
    private String model;
    private String color;
    private double size;

    public Sneakers(String brand, String model, String color, double size){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getSize() {
        return size;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
