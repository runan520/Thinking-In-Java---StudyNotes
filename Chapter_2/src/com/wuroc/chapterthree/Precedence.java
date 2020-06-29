//: Precedence.java

package com.wuroc.chapterthree;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年6月29日
 *
 * 
 */
public class Precedence {
	public static void main(String[] args) {
		int x = 1,y=2,z=3;
		
		int a = x+y-2/2+z;
		
		int b = x+(y - 2)/(2 + z);
		//String 支持“+” ， “+=”
		//这里的+ 是把
		System.out.println("a = " + a + " b = " + b);
		
	}

} /* Output:
a = 5 b = 1
*///:~
