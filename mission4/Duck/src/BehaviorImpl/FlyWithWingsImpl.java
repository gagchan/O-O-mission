package BehaviorImpl;

import IBehavior.IFlyBehavior;
/**
 * 
 * @author Administrator
 *
 */
public class FlyWithWingsImpl implements IFlyBehavior{

	@Override
	public void fly() {
		System.out.println("wings");
	}

}
