package Shop;

//not implamented with the other classes yet

/**
 * Created by Reece Jones on 24/07/2017.
 */
public class Discounts {
    private Planet planet;
    private int discountPercent ;

    public Planet getPlanet() {
        return planet;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public Discount(Planet planet, int discountPercent) {
        super();
        this.planet = planet;
        this.discountPercent = discountPercent;
    }

//    @Override//do i need this?
//    public String toString() {
//        return "Discount [product=" + planet + ", discountPercent=" + discountPercent + "]";
//    }
}
