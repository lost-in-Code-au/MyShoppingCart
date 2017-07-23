import Shop.BudgetUniverse;
import Shop.Planet;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by Reece Jones on 23/07/2017.
 */
public class Cart {

    ArrayList<Planet> cart;
    BudgetUniverse universe;
    double totalOfCart;

    public Cart(){
        cart = new ArrayList<Planet>();
        universe = new BudgetUniverse();
//        ArrayList<Planet> planets;
    }

    public void addItem(int planet) {
        cart.add(universe.getPlanetByIndex(planet));
    }

    public void removeItem(int planet) {
        cart.remove(planet);
    }

    public String getItemName(int index) {
        return cart.get(index).getName();
    }


    public double getItemPrice(int i) {
        return cart.get(i).getPrice();
    }

    public double getTotalOfCart() {
        double sum = 0;
        for(int i = 0; i < cart.size(); i++)
        {
            sum = sum + cart.get(i).getPrice();
        }
        return sum;
    }

    public void emptyCart() {
        cart.clear();
    }

    public int size() {
        return cart.size();
    }

}
