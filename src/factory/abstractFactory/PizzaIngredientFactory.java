package factory.abstractFactory;

import factory.abstractFactory.pizza.ingredients.*;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
    public Cheese createCheese();
}
