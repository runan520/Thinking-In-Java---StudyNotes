//: OptionalTrailingArguments.java

package com.wuroc.chapterfive;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年7月12日
 * import static com.wuroc.util.Print.*;
 * 
 */
public class OptionalTrailingArguments {
	static void f(int required, String... trailing) {
		System.out.print("required: " + required + " ");
		//是循环每个字符串
		for(String s : trailing) 
			System.out.print(s + " ");
			System.out.println();
		
	}
		public static void main(String[] args) {
			f(1, "one");
			f(2, "two", "three");
			f(3, "Wu", "Roc");
			f(0);
		}
	
}









