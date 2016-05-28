package DuckImpl;

import AbDuck.Duck;
import BehaviorImpl.FlyNoWay;
import BehaviorImpl.Squack;
/**
 * 
 * @author Administrator
 *
 */

public class RubberDuck extends Duck {
	public RubberDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new Squack());
	}
	@Override
	public void display() {
		System.out.println("I'm RubberDuck");
	}

}
