package BehaviorImpl;

import IBehavior.IQuackBehavior;
/**
 * 
 * @author Administrator
 *
 */
		
public class FackQuack implements IQuackBehavior {

	@Override
	public void quack() {
		System.out.println("FackQuack");
	}

}
