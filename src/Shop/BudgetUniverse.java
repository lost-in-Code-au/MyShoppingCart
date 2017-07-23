package Shop;
import java.util.ArrayList;

/**
 * Created by Reece Jones on 23/07/2017.
 */
public class BudgetUniverse {
    ArrayList<Planet> universe;

    public BudgetUniverse(){
        universe = new ArrayList<Planet>();
        universe.add(new Planet("Alderaan", 30_000_000.00, Location.Core_Worlds));
        universe.add(new Planet("Balmorra", 25_000_000.00, Location.Colonial_Region));
        universe.add(new Planet("Hoth", 6_000_000.00, Location.Outer_Rim));
        universe.add(new Planet("Coruscant", 60_000_000.00, Location.Core_Worlds));
        universe.add(new Planet("Dromund Kaas", 45_000_000.00, Location.Sith_Space));
        universe.add(new Planet("Voss", 15_000_000.00, Location.Outer_Rim));
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
