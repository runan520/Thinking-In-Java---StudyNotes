//Adventure.java
package com.wuroc.chapternine;

/**
 * @author RocWu
 *
 */
interface CanFight{
	void fight();
}
interface CanSwim {
	void swim();
}
interface CanFly{
	void fly();
}
class ActionCharacter {
	public void fight() {
		
	}
}
//需要把类放在最前面，把接口放在最后面
class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Adventure {
	//传进去的引用
	public static void t(CanFight x) {
		x.fight();
	}
	
	public static void u(CanSwim x) {
		x.swim();
	}
	
	public static void v(CanFly x) {
		x.fly();
	}
	
	public static void w(ActionCharacter x) {
		x.fight();
	}
	
	public static void main(String[] args) {
		Hero h = new Hero();
		t(h);
		u(h);
		v(h);
		w(h);
	}
}





