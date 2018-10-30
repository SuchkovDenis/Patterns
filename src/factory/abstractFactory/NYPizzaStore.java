package factory.abstractFactory;

import factory.abstractFactory.pizza.CheesePizza;
import factory.abstractFactory.pizza.ClamPizza;
import factory.abstractFactory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        switch (type) {
            case "cheese" :
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                return pizza;
            case "clam" :
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
                return pizza;
            default:
                return null;
        }
    }
}
