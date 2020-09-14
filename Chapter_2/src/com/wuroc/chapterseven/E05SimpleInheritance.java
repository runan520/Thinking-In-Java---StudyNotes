//: E05SimpleInheritance.java

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
class A {
	public A() {
		print("A()");
	}
	
}
class B {
	public B() {
		print("B()");
	}
}
class C extends A{
	B b = new B();
}
public class E05SimpleInheritance {
	public static void main(String[] args) {
//		在这里，编译器为C合成了一个构造函数，
//		首先调用基类构造函数，然后再调用成员对象构造函数。
		new C();
	}

}
/*Output:
 * A()
 * B()
 * 使用宣布自己的默认构造函数（空参数列表）创建类A和B。
 * 从A继承一个名为C的新类，并在C内创建类B的成员。
 * 不要为C创建构造函数。
 * 创建一个C类的对象并观察结果。
 *///
