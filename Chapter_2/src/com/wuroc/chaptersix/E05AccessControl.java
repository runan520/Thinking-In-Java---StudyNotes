//: E05AccessControl.java

package com.wuroc.chaptersix;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月15日
 * import static com.wuroc.util.Print.*;
 * 
 */
public class E05AccessControl {
	public int a;
	private int b;
	protected int c;
	int d;   //包访问权限域
	public void f1() {}
	private void f2() {}
	protected void f3() {}
	void f4() {}  //包访问权限域
	public static void main(String args[]) {
		E05AccessControl test = new E05AccessControl();
		test.a = 1;
		test.b = 2;
		test.c = 3;
		test.d = 4;
		test.f1();
		test.f2();
		test.f3();
		test.f4();
	}
}
