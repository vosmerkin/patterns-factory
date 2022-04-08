package pizza;

import ingredients.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Pizza {




    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;
    List<String> toppings = new ArrayList<>();


    public abstract void prepare();
//    {
//        System.out.println("Preparing " + name);
//        System.out.println("Tossing dough..." + dough);
//        System.out.println("Adding sauce..." + sauce);
//        System.out.println("Adding toppings: ");
//        for (String topping : toppings) {
//            System.out.println("     " + topping);
//        }
//    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clams=" + clam +
                ", toppings=" + toppings +
                '}';
    }
}
