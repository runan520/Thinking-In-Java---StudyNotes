//: E23ClassLoading.java

package com.wuroc.chapterseven;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月22日
 * import static com.wuroc.util.Print.*;
 * 
 */
class LoadTest {
	static {
		System.out.println("Loading LoadTest");
	}
	static void staticMember() {
		System.out.println("staticMember");
		
	}
}
public class E23ClassLoading {
	public static void main(String args[]) {
		//加载类的动作仅发生一次，否则输出就会出现两个Loading LoadTest
		System.out.println("Calling static member");
		LoadTest.staticMember();
		System.out.println("Creating an object");
		new LoadTest();
	}
	

}
/*Output
Calling static member
Loading LoadTest
Creating an object
*///
