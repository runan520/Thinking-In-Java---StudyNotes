//: Flower.java

package com.wuroc.chapterfive;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月10日
 *
 * 
 */
public class Flower {
	int petalCount = 0;
	
	String s = "initial value";
	
	Flower(int petals){
		petalCount = petals;
		System.out.println("Contructor w/ int arg only, petalCount = "
		+ petalCount);		
	}
	Flower(String ss){
		System.out.println("Constructor w/ string arg only, s = " + ss);
		s = ss;
	}
	
	Flower(String s, int petals){
		//调用另一个构造器，必须写在首行
		this(petals);
		//这是代表成员变量s
		this.s = s;
		System.out.println("String & int args");
	}
	Flower(){
		this("hi", 47);
		System.out.println("no-arg contructor");
	
	}
	void printPetalCount() {
		System.out.println("petalCount = " + petalCount + " s = " + s);
		
	}
	public static void main(String[] args) {
		Flower x = new Flower();
		x.printPetalCount();
	}

}







