package DuckImpl;

import AbDuck.Duck;
import BehaviorImpl.FlyRockerPoweredImpl;
import BehaviorImpl.Quack;
/**
 * 
 * @author Administrator
 *
 */
public class RedHeadDuck extends Duck {
public RedHeadDuck() {
	setFlyBehavior(new FlyRockerPoweredImpl());
	setQuackBehavior(new Quack() );
}
	@Override
	public void display() {
		System.out.println("I'm RedHeadDuck!");
	}

}
