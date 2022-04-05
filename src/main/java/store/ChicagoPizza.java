package store;

import pizza.CheesePizza;
import pizza.GreekPizza;
import pizza.PepperoniPizza;
import pizza.Pizza;

public class ChicagoPizza extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new CheesePizza();
        } else if (item.equals("greek")) {
            return new GreekPizza();
        } else if (item.equals("pepperoni")) {
            return new PepperoniPizza();
        } else {
            return null;
        }
    }

}
