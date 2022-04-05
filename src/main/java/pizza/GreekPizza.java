package pizza;

public class GreekPizza implements Pizza {
    String pizzaName = "pizza.GreekPizza";

    @Override
    public void prepare() {
        System.out.println("Preparing " + pizzaName);
    }

    @Override
    public void bake() {
        System.out.println("Baking " + pizzaName);
    }

    @Override
    public void cut() {
        System.out.println("Cutting " + pizzaName);
    }

    @Override
    public void box() {
        System.out.println("Boxing " + pizzaName);
    }
}
