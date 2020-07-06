//: E06eTest.java

package com.wuroc.chapterfour;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月6日
 *
 * 
 */
public class E06eTest {

	static boolean test (int testval, int begin, int end) {
		boolean result = false;
		if (testval >= begin && testval <= end)
			result = true;
		return result;
	}
	public static void main(String[] args) {
		System.out.println(test(10, 5, 15));
		
		System.out.println(test(5, 5, 15));
		
		System.out.println(test(5, 5, 5));
		
	}
}
