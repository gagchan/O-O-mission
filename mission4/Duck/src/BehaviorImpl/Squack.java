package BehaviorImpl;

import IBehavior.IQuackBehavior;
/**
 * 
 * @author Administrator
 *
 */
public class Squack implements IQuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squack");
	}

}
