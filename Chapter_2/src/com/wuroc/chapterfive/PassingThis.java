//: Person.java

package com.wuroc.chapterfive;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月9日
 *
 * 
 */
class Person {
	
	public void eat(Apple apple) {
		
		Apple peeled = apple.getPeeled();
		
		System.out.println("WuRoc");
	}
}
class Peeler{
	
	static Apple peel(Apple apple) {
		
		return apple;
	}
}
class Apple{
	
	Apple getPeeled() {
		
		return Peeler.peel(this);
		
	}
}
public class PassingThis{
	
	public static void main(String[] args) {
		
		new Person().eat(new Apple());
	}
}
	





