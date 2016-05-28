package AbDuck;

import IBehavior.IFlyBehavior;
import IBehavior.IQuackBehavior;
/**
 * 
 * @author Administrator
 *
 */
public abstract class Duck {
	IFlyBehavior flyBehavior;
	IQuackBehavior quackBehavior;
	public void swin(){
		System.out.println("I can swin");
	}
	public void parformFly(){
		flyBehavior.fly();
	}
	public void parformQuack(){
		quackBehavior.quack();
	}
	public abstract void display();
	public void setFlyBehavior(IFlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public void setQuackBehavior(IQuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
