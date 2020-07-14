//: E09ThisConstructorCall.java

package com.wuroc.chapterfive;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月10日
 *
 * 
 */
public class E09ThisConstructorCall {
	public E09ThisConstructorCall(String s) {
		System.out.println("s = " + s);
	}
	public E09ThisConstructorCall(int i) {
		//这里调用了第二个构造器
		this("i = " + i);
	}
	public static void main(String args[]) {
		new E09ThisConstructorCall("String call");
		new E09ThisConstructorCall(47);
	}

} /*Output:
s = String call
s = i = 47
*///





