package factory.simpleFactory.pizza;

public class PizzaCheese extends Pizza{
    public PizzaCheese() {
        name = "Cheece pizza";
        dough = "Slim dough";
        sauce = "Cheece sauce";

        toppings.add("Parmizano cheese");
        toppings.add("Our special cheese");
    }
}
