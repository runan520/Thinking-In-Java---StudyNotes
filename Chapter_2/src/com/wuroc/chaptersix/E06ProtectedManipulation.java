//: E06ProtectedManipulation.java

package com.wuroc.chaptersix;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月15日
 * import static com.wuroc.util.Print.*;
 * 
 */
class WithProtected{
	protected int i;
	protected void f() {
		System.out.println("Protected");
	}
}
public class E06ProtectedManipulation {
	public static void main(String[] args) {

	WithProtected wp = new WithProtected();
	wp.i = 47;
	wp.f();
	System.out.println("wp.i = " + wp.i);
	
}
}
