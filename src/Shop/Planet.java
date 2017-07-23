package Shop;

/**
 * Created by Reece Jones on 23/07/2017.
 */
public class Planet {
    private String name;
    private double price;

    protected Planet(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
