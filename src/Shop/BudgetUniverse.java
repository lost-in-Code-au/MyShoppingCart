package Shop;
import java.util.ArrayList;

/**
 * Created by Reece Jones on 23/07/2017.
 */
public class BudgetUniverse {
    ArrayList<Planet> universe;

    public BudgetUniverse(){
        universe = new ArrayList<Planet>();
        universe.add(new Planet("Alderaan", 30000000.00));
        universe.add(new Planet("Balmorra", 25000000.00));
        universe.add(new Planet("Hoth", 6000000.00));

    }

    public Planet getPlanetByIndex(int index) {
        return universe.get(index);
    }

    public String getPlanetNameByIndex(int index) {
        return universe.get(index).getName();
    }

    public double getPlanetPricebyIndex(int index) {
        return universe.get(index).getPrice();
    }
}
