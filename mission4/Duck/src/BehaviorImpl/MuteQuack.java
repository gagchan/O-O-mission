package BehaviorImpl;

import IBehavior.IQuackBehavior;
/**
 * 
 * @author Administrator
 *
 */
public class MuteQuack implements IQuackBehavior {

	@Override
	public void quack() {
		System.out.println("MuteQuack");
	}

}
