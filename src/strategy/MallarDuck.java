package strategy;

public class MallarDuck extends Duck {
	public MallarDuck() {
        quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
    public void display() {
        System.out.println("I'm a mallar Duck");
    }
}