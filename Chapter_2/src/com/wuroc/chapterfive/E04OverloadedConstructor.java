//: E04OverloadedConstructor.java

package com.wuroc.chapterfive;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月9日
 *
 * 
 */
public class E04OverloadedConstructor {
	/**
	 * 
	 */
	E04OverloadedConstructor() {

		System.out.println("Default constructor");
	}

	E04OverloadedConstructor(String s){
		System.out.println("String arg constructor");
		System.out.println(s);
	}
	public static void main(String[] args) {
		new E04OverloadedConstructor();
		new E04OverloadedConstructor("Overloaded");
	}
}/*Output:
Default constructor
String arg constructor
Overloaded
*///





