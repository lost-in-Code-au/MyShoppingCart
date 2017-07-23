package Shop;

/**
 * Created by Reece Jones on 23/07/2017.
 */
public class Planet {
    private String name;
    private double price;
    private Location location;

    protected Planet(String name, double price, Location location){
        this.name = name;
        this.price = price;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
