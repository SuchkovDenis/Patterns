package factory.abstractFactory;

import factory.abstractFactory.pizza.ingredients.*;
import factory.abstractFactory.pizza.ingredients.ny.*;
import factory.abstractFactory.pizza.ingredients.ny.veggies.Garlic;
import factory.abstractFactory.pizza.ingredients.ny.veggies.Mushroom;
import factory.abstractFactory.pizza.ingredients.ny.veggies.Onion;
import factory.abstractFactory.pizza.ingredients.ny.veggies.RedPepper;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
}
