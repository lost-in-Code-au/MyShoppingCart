import Shop.BudgetUniverse;
import Shop.Planet;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by Reece Jones on 23/07/2017.
 */
public class Cart {

    ArrayList<Planet> planets;
    BudgetUniverse universe;
    double totalOfCart;

    public Cart(){
        universe = new BudgetUniverse();
        ArrayList<Planet> planets;
    }

    public void addItem(int planet) {
        planets.add(universe.getPlanetByIndex(planet));
    }

    public void removeItem(int planet) {
        planets.remove(planet);
    }

    public String getItemsName(int index) {
        return planets.get(index).toString();
    }

    public void getTotalOfCart() {
        planets.size();
    }

    public void emptyCart() {
        planets.clear();
    }
}
