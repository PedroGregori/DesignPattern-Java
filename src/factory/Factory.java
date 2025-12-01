package factory;

public class Factory {
    private final String name;
    private final String location;

    public Factory(String name, String location){
        this.name = name;
        this.location = location;
    }

    public Sneakers createSneakers(String brand, String model, String color, double size){
        return new Sneakers(brand, model, color, size);
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}
