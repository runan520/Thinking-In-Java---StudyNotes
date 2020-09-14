//: Detergent2.java

package com.wuroc.chapterseven;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月17日
 * import static com.wuroc.util.Print.*;
 * 
 */
class Cleanser2{
	private String s =  "Cleanser2 ";
	public void append(String a) {
		s += a;
	}
	//2
	public void scrub() {
			append("scrub()");
	}
	public String toString() {
		return s;
	}
}
public class Detergent2 extends Cleanser2{

	@Override
	public void scrub() {
		//1
		append(" Detergent2.scrub() ");
		super.scrub();
	}
	//3
	public void sterolize() {
		append(" sterolize() ");
	}

	public static void main(String[] args) {
		Detergent2 x = new Detergent2();
		x.scrub();
		x.sterolize();
		System.out.println(x);
	}
}




