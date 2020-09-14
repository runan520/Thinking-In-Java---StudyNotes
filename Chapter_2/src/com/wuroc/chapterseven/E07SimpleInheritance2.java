//: E07SimpleInheritance2.java

package com.wuroc.chapterseven;

import static com.wuroc.util.Print.print;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月17日
 * import static com.wuroc.util.Print.*;
 * 
 */
class A2 {
	public A2(String s) {
		print("A2() :" + s);
	}
	
}
class B2 {
	public B2(String s) {
		print("B2() :7" + s);
	}
}
class C2 extends A2{
	B2 b;
	public C2(String s) {
	super(s);
	 b = new B2(s);
	}
}
public class E07SimpleInheritance2 {
	public static void main(String[] args) {
//		在这里，编译器为C合成了一个构造函数，
//		首先调用基类构造函数，然后再调用成员对象构造函数。
		new C2("Init string");
	}

}