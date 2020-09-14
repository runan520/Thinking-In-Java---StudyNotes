//: Detergent.java

package com.wuroc.chapterseven;
import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月17日
 * 
 * 
 */
class Cleanser {
	private String s = "Cleanser ";
	public void append(String a ) {
		s += a;
	}
	public void dilute() {
		append(" dilute()");
	} 
	public void apply() {
		append(" apply()");
	}
	public void scrub() {
		append(" scrub()");
		
	}
	@Override
	public String toString() {
		return s;
	}
	public static void main(String[] args) {
		Cleanser  x = new Cleanser();
		x.dilute();
		x.apply();
		x.scrub();
		System.out.println(x);
	}
}
public class Detergent extends Cleanser {
	
	@Override
	public void scrub() {
		append(" Detergebt.scrub()");
		/*
		 * 但是在scrub（）内部，不能简单地调用scrub（），因为这会产生递归调用。
		 * 为了解决这个问题，Java的super关键字引用了当前类继承的“超类”（基类）。
		 *  因此表达式 super.scrub（）调用方法scrub（）的基类版本。
		 */
		super.scrub();
	}
	public void foam() {
		append(" foam() "); 
		}
	public static void main(String[] args) {
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		print("Testing base class:");
		Cleanser.main(args);
	}
	}
	
