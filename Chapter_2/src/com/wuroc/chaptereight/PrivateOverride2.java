//: PrivateOverride2.java

package com.wuroc.chaptereight;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年8月20日
 * import static com.wuroc.util.Print.*;
 * 
 */
public class PrivateOverride2 {
	private void f() {
		System.out.println("private f()");
	}
	public static void main(String[] args) {
		PrivateOverride2 po = new Derived2();
		po.f();
	}

}
class Derived2 extends PrivateOverride2{
//	@Override
//	public void f() {
//		System.out.println("public f()");
//	}
}
