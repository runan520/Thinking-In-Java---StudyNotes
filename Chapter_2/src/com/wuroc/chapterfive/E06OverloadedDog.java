//: E06OverloadedDog.java

package com.wuroc.chapterfive;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月9日
 *
 * 
 */
class Dog2{
	public void bark(int i, double d) {
		System.out.println("int, double bark");
	}
	public void bark(double d, int i) {
		System.out.println("double, int bark");
	}
}
public class E06OverloadedDog {
	public static void main(String[] args) {
		
	Dog2 dog = new Dog2();
	dog.bark(1, 4.7);
	dog.bark(4.7, 1);
	
	
	}
}
/*Output: 
int,double bark
double,int bark
*///:~





