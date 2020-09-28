//E05InstanceOfIner.java
package com.wuroc.chapterten;

/**
 * @author RocWu
 *
 */
class Outer3{
	class Inner{
		{
			System.out.println("Inner crated");
		}
	}
}
public class E05InstanceOfIner {
	public static void main(String[] args) {
		Outer3 o = new Outer3();
		Outer3.Inner i = o.new Inner();
	}
}
