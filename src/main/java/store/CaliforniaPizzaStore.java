package store;

import pizza.CaliforniaStyleCheesePizza;
import pizza.Pizza;

public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")){
            return new CaliforniaStyleCheesePizza();
//        } else if (item.equals("pepperoni")) {
//            return new CaliforniaStylePepperoniPizza();
//        } else if (item.equals("clam")) {
//            return new CaliforniaStyleClamPizza();
//        } else if (item.equals("veggie")) {
//            return new CaliforniaStyleVeggiePizza();
        } else {
            return null;
        }
    }
}
