package Shop;

import java.math.BigDecimal;
import java.util.HashMap;

/**
 * Created by Reece Jones on 23/07/2017.
 */
public class BudgetUniverse {
    HashMap<String, BigDecimal> galaxy;

    protected BudgetUniverse(){
        galaxy = new HashMap<String, BigDecimal>();

        galaxy.put("Alderaan", BigDecimal.valueOf(30000000.00));
        galaxy.put("Balmorra", BigDecimal.valueOf(25000000.00));
        galaxy.put("Hoth", BigDecimal.valueOf(6000000.00));
    }

    public String[] BudgetUniverse getKey() {
        return galaxy.keySet();
    }
}
