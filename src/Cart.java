import Shop.BudgetUniverse;
import Shop.Planet;
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
        totalOfCart = getTotalOfCart();//to provided update on view.
    }

    public void addItem(int planet) {
        cart.add(universe.getPlanetByIndex(planet));
    }

    public void removeItem(int index) {
        cart.remove(index);
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

    public String checkForDiccountOfTwoForOne(int index) {
        //I need to take a item from the array cart and compare it to each other item in the array
        String a = getItemName(index);

        for (int x = 0; x < cart.size(); x++)
        {
            if (index != x){
                if (a == getItemName(x)){ cart.get(x).setPrice(0.0);}
            }
        }
        return a;
    }

    public int size() {
        return cart.size();
    }

}
