package factory.factoryMethod;

import factory.factoryMethod.pizza.ChicagoStyleCheesePizza;
import factory.factoryMethod.pizza.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type)
    {
        switch (type) {
            case "cheese" :
                return new ChicagoStyleCheesePizza();
            default:
                return null;
        }
    }
}
