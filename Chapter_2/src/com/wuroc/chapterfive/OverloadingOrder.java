//: OverloadingOrder.java

package com.wuroc.chapterfive;
import static com.wuroc.util.Print.*;
/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月9日
 *
 * 
 */
public class OverloadingOrder {
	static void f(String s, int i) {
		print("String: " + s + ", int:" + i);
		
	}
	static void f(int i, String s) {
		print("int: " + i + ", String: " + s);
	}
	public static void main(String[] args) {
		
		f("String first", 11);
		
		f(99, "Int first");
	}

} /*Output:
String: String first, int:11
int: 99, String: Int first
*///:WuRoc
