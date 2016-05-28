package DuckImpl;

import AbDuck.Duck;
import BehaviorImpl.FlyWithWingsImpl;
import BehaviorImpl.Quack;
/**
 * 
 * @author Administrator
 *
 */
public class MallardDuck extends Duck {
public MallardDuck() {
	setFlyBehavior(new FlyWithWingsImpl());
	setQuackBehavior(new Quack());
}
	@Override
	public void display() {
		System.out.println("I'm MallarDuck");
	}

}
