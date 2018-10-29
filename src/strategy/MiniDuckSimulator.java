package strategy;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallarDuck();
		mallard.performQuack();
		mallard.performFly();

		Duck modelDuck = new ModelDuck();
		modelDuck.performFly();
		modelDuck.setFlyBehavior(new FlyRocketPower());
		modelDuck.performFly();
	} 
}