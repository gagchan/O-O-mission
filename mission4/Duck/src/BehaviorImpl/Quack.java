package BehaviorImpl;

import IBehavior.IQuackBehavior;
/**
 * 
 * @author Administrator
 *
 */
public class Quack implements IQuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack");
	}

}
