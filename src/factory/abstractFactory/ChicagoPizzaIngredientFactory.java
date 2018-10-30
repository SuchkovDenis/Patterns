package factory.abstractFactory;

import factory.abstractFactory.pizza.ingredients.*;
import factory.abstractFactory.pizza.ingredients.chicago.*;
import factory.abstractFactory.pizza.ingredients.chicago.veggies.BlackOlives;
import factory.abstractFactory.pizza.ingredients.chicago.veggies.EggPlant;
import factory.abstractFactory.pizza.ingredients.chicago.veggies.Spinach;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlutTomatoSauce();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new BlackOlives(), new EggPlant(), new Spinach()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }
}
