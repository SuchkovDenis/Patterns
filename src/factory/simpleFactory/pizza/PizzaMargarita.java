package factory.simpleFactory.pizza;

public class PizzaMargarita extends Pizza{
    public PizzaMargarita() {
        name = "Margarita pizza";
        dough = "Thick dough";
        sauce = "BBQ sauce";

        toppings.add("Gauda cheese");
        toppings.add("Our special ingredient");
    }
}
