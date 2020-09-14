//: E15ProtectedTest.java

package com.wuroc.chapterseven;

import com.wuroc.chaptersix2.E15Protected;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月22日
 * import static com.wuroc.util.Print.*;
 * 
 */
class Derived extends E15Protected{
	public void g() {
		f();
	}
}
public class E15ProtectedTest {
	public static void main(String[] args) {
//		在程序包外部，您只能访问继承的类内的protected member。
//		new E15Protected().f();
		new Derived().g();
	}
}
