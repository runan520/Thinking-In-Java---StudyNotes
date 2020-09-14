//: DetergentDelegation.java

package com.wuroc.chapterseven;
import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月20日
 * 
 * 
 */
class DetergentDelegation {
	private Cleanser cleanser = new Cleanser();
	//代理方法
	public void append(String a) {
		cleanser.append(a);
	}
	public void dilute() {
		cleanser.dilute();
		}
	public void apply() {
		cleanser.apply();
	}
	public String toString() {
		return cleanser.toString();
	}
	public void scrub() {
		append("DetergentDelegation.scrub");
		cleanser.scrub();
	}
	public void foam() {
		append(" foam()");
	}
	public static void main(String[] args) {
		DetergentDelegation x = new DetergentDelegation();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		print(x);
		//基础类与派生类不一样
		print("Test base class: ");
		Cleanser.main(args);
	}

}
public class E11Delegation{
	public static void main(String[] args) {
		
		DetergentDelegation.main(args);
	}
	
}
/*Output:
Cleanser  dilute() apply()DetergentDelegation.scrub scrub() foam()
Test base class: 
Cleanser  dilute() apply() scrub()
*///
