import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by Reece Jones on 23/07/2017.
 */
public class Cart {

    ArrayList<String> planets;
    String[] keys;
    BigDecimal totalOfCart;

    public Cart(){
        planets = new ArrayList<String>();
        keys = new String[]{"Alderaan", "Balmorra", "Hoth"};
    }

    public void addItem(String planet){
        planets.add(planet);
    }

    public void removeItem(String planet){
        planets.remove(planet);
    }

    public void getTotalOfCart(){
        planets.size();
    }

    public String getItemName(int index){
        return planets.get(index);
    }
}
