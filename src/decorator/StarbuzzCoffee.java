package decorator;

import decorator.beverage.Beverage;
import decorator.beverage.DarkRoast;
import decorator.beverage.Espresso;
import decorator.beverage.HouseBlend;
import decorator.decorator.Mocha;
import decorator.decorator.Soy;
import decorator.decorator.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(String.format("%s $%.2f", beverage.getDescription(), beverage.cost()));

        Beverage beverage2 = new Whip(new Mocha(new Mocha(new DarkRoast())));
        System.out.println(String.format("%s $%.2f", beverage2.getDescription(), beverage2.cost()));

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(String.format("%s $%.2f", beverage3.getDescription(), beverage3.cost()));

    }
}
