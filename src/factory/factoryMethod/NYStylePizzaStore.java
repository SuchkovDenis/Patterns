package factory.factoryMethod;


import factory.factoryMethod.pizza.NYStyleCheesePizza;
import factory.factoryMethod.pizza.Pizza;

public class NYStylePizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type)
    {
        switch (type) {
            case "cheese" :
                return new NYStyleCheesePizza();
            default:
                return null;
        }
    }
}
