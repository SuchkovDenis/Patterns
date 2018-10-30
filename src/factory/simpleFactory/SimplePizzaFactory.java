package factory.simpleFactory;

import factory.simpleFactory.pizza.Pizza;
import factory.simpleFactory.pizza.PizzaCheese;
import factory.simpleFactory.pizza.PizzaMargarita;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        switch (type) {
            case "Cheese" :
                return new PizzaCheese();
            case "Margarita" :
                return new PizzaMargarita();
            default :
                return null;
        }
    }
}
